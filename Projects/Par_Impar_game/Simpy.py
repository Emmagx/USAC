from sympy import *

# Define las variables
x = symbols("x")
m = 1.5  # Valor de m
b = 5    # Valor de b

# Define la ecuación de la recta
y = m * x + b

# Resuelve la ecuación y = x**2 para encontrar c_x
c_x = solve(y - x**2, x)

# Verifica si c_x tiene elementos antes de acceder a ellos
if c_x:
    # Define el punto A
    A = Point(c_x[0], c_x[0]**2)

    # Define el punto B en términos de x
    x_value_B = 2.0  # Elige un valor específico para x (puedes cambiarlo)
    B = Point(x_value_B, m * x_value_B + b)

    # Define el punto C en términos de x
    x_value_C = 3.0  # Elige un valor específico para x (puedes cambiarlo)
    C = Point(x_value_C, x_value_C**2)

    # Define el triángulo T con los puntos A, C y B
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
    x_B = B.x  # El valor de x de B ya es específico
    x_C = C.x  # El valor de x de C ya es específico
    y_A = A.y.evalf()  # Coordenada en y del punto A
    y_B = B.y  # El valor de y de B ya es específico
    y_C = C.y  # El valor de y de C ya es específico

    # Imprime las respuestas
    print("Coordenada en x del punto A:", round(x_A, 3))
    print("Coordenada en x del punto B:", x_B)
    print("Coordenada en x del punto C:", x_C)
    print("Coordenada en y del punto A:", round(y_A, 3))
    print("Coordenada en y del punto B:", y_B)
    print("Coordenada en y del punto C:", y_C)
    print("Área máxima:", round(max_area, 3))
else:
    print("No hay solución para la ecuación y = x**2 en la recta y = 1.5 * x + 5.")
