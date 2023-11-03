from sympy import *

# Define las variables
x = symbols("x")
m = 1.5  # Valor de m
b = 5    # Valor de b

# Define la ecuación de la recta
y = m * x + b

# Resuelve la ecuación y = x**2 para encontrar c_x
c_x = solve(y - x**2, x)

# Define el punto A
A = Point(c_x[0], c_x[0]**2)

# Define el punto B en términos de x
B = Point(x, m * x + b)

# Define el punto C en términos de x
C = Point(x, x**2)

# Define el triángulo T con los puntos A, C, y B
T = Triangle(A, C, B)

# Calcula el área del triángulo
AT = T.area

# Calcula la derivada de AT respecto de x
DA = diff(AT, x)

# Resuelve la derivada para encontrar el valor de x donde se maximiza el área
s = solve(DA, x)

# Calcula el área máxima
max_area = AT.subs(x, s[0]).evalf()

# Respuestas a las preguntas
x_A = A.x.evalf()  # Coordenada en x del punto A
x_B = B.x.evalf()  # Coordenada en x del punto B
x_C = C.x.evalf()  # Coordenada en x del punto C
y_A = A.y.evalf()  # Coordenada en y del punto A
y_B = B.y.evalf()  # Coordenada en y del punto B
y_C = C.y.evalf()  # Coordenada en y del punto C

# Imprime las respuestas
print("Coordenada en x del punto A:", round(x_A, 3))
print("Coordenada en x del punto B:", round(x_B, 3))
print("Coordenada en x del punto C:", round(x_C, 3))
print("Coordenada en y del punto A:", round(y_A, 3))
print("Coordenada en y del punto B:", round(y_B, 3))
print("Coordenada en y del punto C:", round(y_C, 3))
print("Área máxima:", round(max_area, 3))
