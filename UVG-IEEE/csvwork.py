import csv

# Datos de ejemplo
lista = [1, 2, 3,4, 'cadena', True, 2.12]
# {"clave" : Valor}
diccionario = {"clave" : 12}
empleados = [
    {"ID": 1, "Nombre": "Juan Perez", "Salario": 3000}, # clave valor
    {"ID": 2, "Nombre": "Ana Gómez", "Salario": 3200},
    {"ID": 3, "Nombre": "Carlos Sanchez", "Salario": 2800}
]

# Crear y escribir en el archivo CSV
with open("empleados.csv", mode="w", newline="") as archivo_csv:
    campos = ["ID", "Nombre", "Salario"]
    escritor = csv.DictWriter(archivo_csv, fieldnames=campos)
    escritor.writeheader()  # Escribe el encabezado
    escritor.writerows(empleados)  # Escribe los datos

# Leer el archivo CSV
with open("empleados.csv", mode="r") as archivo_csv:
    lector = csv.DictReader(archivo_csv)
    for fila in lector:
        print(fila)

# Leer y modificar los datos
empleados_modificados = []

with open("empleados.csv", mode="r") as archivo_csv:
    lector = csv.DictReader(archivo_csv)
    for fila in lector:
        if fila["Nombre"] == "Juan Perez":
            fila["Salario"] = 3500  # Modificar el salario
        empleados_modificados.append(fila)

# Guardar los cambios en el archivo CSV
with open("empleados.csv", mode="w", newline="") as archivo_csv:
    campos = ["ID", "Nombre", "Salario"]
    escritor = csv.DictWriter(archivo_csv, fieldnames=campos)
    escritor.writeheader()
    escritor.writerows(empleados_modificados)
