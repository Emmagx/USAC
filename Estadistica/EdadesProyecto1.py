# Importamos las librerías necesarias para analizar los datos
import numpy as np
import pandas as pd
from scipy import stats
import matplotlib.pyplot as plt

edades = [20, 20, 20, 24, 19, 20, 20, 20, 20, 21, 25, 20, 20, 21, 20, 18, 31, 20, 24, 21,
          23, 21, 19, 19, 19, 21, 20, 20, 21, 19, 19, 19, 18, 21, 19, 19, 19, 19, 22, 23,
          20, 20, 20, 22, 19, 25, 18, 21, 22, 21]

# Convertimos la lista a una serie de pandas para facilitar los cálculos
edades_serie = pd.Series(edades)

# Calcular la tabla de frecuencias
tabla_frecuencia = edades_serie.value_counts().sort_index()

# Medidas de tendencia central
media = edades_serie.mean()
mediana = edades_serie.median()
moda = edades_serie.mode()[0]

# Medidas de dispersión
varianza = edades_serie.var()
desviacion_estandar = edades_serie.std()
rango = edades_serie.max() - edades_serie.min()
rango_intercuartilico = edades_serie.quantile(0.75) - edades_serie.quantile(0.25)

# Medidas de forma (sesgo y curtosis)
sesgo = edades_serie.skew()
curtosis = edades_serie.kurtosis()

# Percentiles y deciles
percentil_90 = edades_serie.quantile(0.90)
decile_2 = edades_serie.quantile(0.2)
decile_6 = edades_serie.quantile(0.6)

# Resultados
tabla_frecuencia, media, mediana, moda, varianza, desviacion_estandar, rango, rango_intercuartilico, sesgo, curtosis, percentil_90, decile_2, decile_6
print("Tabla de Frecuencia:")
print(tabla_frecuencia)

print("\nMedidas de Tendencia Central:")
print(f"Media: {media}")
print(f"Mediana: {mediana}")
print(f"Moda: {moda}")

print("\nMedidas de Dispersión:")
print(f"Varianza: {varianza}")
print(f"Desviación Estándar: {desviacion_estandar}")
print(f"Rango: {rango}")
print(f"Rango Intercuartílico: {rango_intercuartilico}")

print("\nMedidas de Forma:")
print(f"Sesgo: {sesgo}")
print(f"Curtosis: {curtosis}")

print("\nPercentiles y Deciles:")
print(f"Percentil 90 (P90): {percentil_90}")
print(f"Decil 2 (D2): {decile_2}")
print(f"Decil 6 (D6): {decile_6}")

# Gráfico de puntos
plt.figure(figsize=(10, 5))
plt.plot(edades, 'o', color='b')
plt.title('Gráfico de Puntos - Edades')
plt.xlabel('Índice')
plt.ylabel('Edad')
plt.grid(True)
plt.show()

# Gráfico de barras
plt.figure(figsize=(10, 5))
tabla_frecuencia.plot(kind='bar', color='orange')
plt.title('Gráfico de Barras - Frecuencia de Edades')
plt.xlabel('Edad')
plt.ylabel('Frecuencia')
plt.grid(True)
plt.show()

genero = ['Masculino', 'Femenino', 'Masculino', 'Masculino', 'Femenino', 'Masculino', 'Masculino', 'Femenino',
          'Masculino', 'Masculino', 'Femenino', 'Masculino', 'Masculino', 'Femenino', 'Masculino', 'Masculino',
          'Masculino', 'Masculino', 'Femenino', 'Masculino', 'Masculino', 'Masculino', 'Masculino', 'Masculino',
          'Masculino', 'Femenino', 'Masculino', 'Femenino', 'Femenino', 'Masculino', 'Masculino', 'Masculino',
          'Femenino', 'Femenino', 'Masculino', 'Masculino', 'Masculino', 'Masculino', 'Femenino', 'Femenino',
          'Femenino', 'Masculino', 'Masculino', 'Masculino', 'Masculino', 'Masculino', 'Masculino', 'Femenino',
          'Masculino', 'Masculino']

ocupacion = ['Estudio', 'Trabajo y Estudio', 'Estudio', 'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio',
             'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio',
             'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio',
             'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio',
             'Trabajo y Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio',
             'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio',
             'Estudio', 'Estudio', 'Trabajo y Estudio', 'Estudio']

# Convertimos a series de pandas
genero_serie = pd.Series(genero)
ocupacion_serie = pd.Series(ocupacion)

# Tabla de frecuencias para género y ocupación
tabla_frecuencia_genero = genero_serie.value_counts()
tabla_frecuencia_ocupacion = ocupacion_serie.value_counts()

# Medidas de tendencia central: En variables cualitativas solo se usa la moda (la categoría más frecuente)
moda_genero = genero_serie.mode()[0]
moda_ocupacion = ocupacion_serie.mode()[0]

# Imprimir resultados en consola
print("Tabla de Frecuencia - Género:\n", tabla_frecuencia_genero)
print("\nTabla de Frecuencia - Ocupación:\n", tabla_frecuencia_ocupacion)
print("\nModa - Género:", moda_genero)
print("Moda - Ocupación:", moda_ocupacion)

# Graficar género y ocupación - gráfico circular y gráfico de barras

# Gráfico circular de género
plt.figure(figsize=(7, 7))
tabla_frecuencia_genero.plot(kind='pie', autopct='%1.1f%%', colors=['lightblue', 'orange'], labels=tabla_frecuencia_genero.index)
plt.title('Distribución por Género')
plt.ylabel('')
plt.show()

# Gráfico de barras de género
plt.figure(figsize=(7, 5))
tabla_frecuencia_genero.plot(kind='bar', color='lightblue')
plt.title('Frecuencia por Género')
plt.xlabel('Género')
plt.ylabel('Frecuencia')
plt.grid(True)
plt.show()

# Gráfico circular de ocupación
plt.figure(figsize=(7, 7))
tabla_frecuencia_ocupacion.plot(kind='pie', autopct='%1.1f%%', colors=['lightgreen', 'salmon'], labels=tabla_frecuencia_ocupacion.index)
plt.title('Distribución por Ocupación')
plt.ylabel('')
plt.show()

# Gráfico de barras de ocupación
plt.figure(figsize=(7, 5))
tabla_frecuencia_ocupacion.plot(kind='bar', color='lightgreen')
plt.title('Frecuencia por Ocupación')
plt.xlabel('Ocupación')
plt.ylabel('Frecuencia')
plt.grid(True)
plt.show()
