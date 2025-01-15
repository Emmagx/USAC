import pypdfium2 as pdfium
from pathlib import Path
from PIL import Image
import img2pdf
import os
import sys

nombre_pdf = sys.argv[1]
nombre_pdf_comprimido = sys.argv[2]
nombre_pdf_sin_extension = Path(nombre_pdf).stem
escala = 1  # Escala para convertir PDF a imagen

# Extraer cada página del PDF como imagen
pdf = pdfium.PdfDocument(nombre_pdf)
cantidad_paginas = len(pdf)
imagenes = []
for indice_pagina in range(cantidad_paginas):
    numero_pagina = indice_pagina + 1
    nombre_imagen = f"{nombre_pdf_sin_extension}_{numero_pagina}.jpg"
    imagenes.append(nombre_imagen)
    print(f"Extrayendo página {numero_pagina} de {cantidad_paginas}")
    pagina = pdf.get_page(indice_pagina)
    imagen_para_pil = pagina.render(scale=escala).to_pil()
    imagen_para_pil.save(nombre_imagen)

imagenes_comprimidas = []

# Comprimir imágenes.
calidad = 70
for nombre_imagen in imagenes:
    print(f"Comprimiendo {nombre_imagen}...")
    nombre_imagen_sin_extension = Path(nombre_imagen).stem
    nombre_imagen_salida = f"{nombre_imagen_sin_extension}_comprimida.jpg"
    try:
        imagen = Image.open(nombre_imagen)
        imagen.save(nombre_imagen_salida, optimize=True, quality=calidad)
        imagenes_comprimidas.append(nombre_imagen_salida)
    except Exception as e:
        print(f"Error al comprimir {nombre_imagen}: {e}")

# Filtrar imágenes no válidas antes de convertir a PDF
imagenes_comprimidas = [img for img in imagenes_comprimidas if isinstance(img, str) and Path(img).exists()]

# Escribir imágenes en un nuevo PDF
print("Creando PDF comprimido...")
try:
    pdf_bytes = img2pdf.convert(imagenes_comprimidas)
    if pdf_bytes is not None:
        with open(nombre_pdf_comprimido, "wb") as documento:
            documento.write(pdf_bytes)
    else:
        print("Error: No se pudo convertir las imágenes a PDF.")
except Exception as e:
    print(f"Error al crear el PDF comprimido: {e}")

# Eliminar imágenes temporales
for imagen in imagenes + imagenes_comprimidas:
    if Path(imagen).exists():
        os.remove(imagen)
        
