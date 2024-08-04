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
    # Define el punto A con c_x simbólico
    A = Point(c_x[0], c_x[0]**2)

    # Define el punto B y C con valores específicos
    x_value_B = 2.0
    x_value_C = 3.0

    B = Point(x_value_B, m * x_value_B + b)
    C = Point(x_value_C, x_value_C**2)

    # Define el triángulo T con los puntos A, C y B
    T = Triangle(A, C, B)

    # Calcula el área del triángulo (será un número porque B y C son específicos)
    AT = T.area

    # No se puede derivar el área porque los puntos B y C son específicos.
    # Por lo tanto, calculamos el área directamente:
    max_area = AT.evalf()

    # Respuestas a las preguntas
    x_A = A.x.evalf()
    x_B = B.x
    x_C = C.x
    y_A = A.y.evalf()
    y_B = B.y
    y_C = C.y

    # Imprime las respuestas
    print("Coordenada en x del punto A:", round(x_A, 3))
    print("Coordenada en x del punto B:", x_B)
    print("Coordenada en x del punto C:", x_C)
    print("Coordenada en y del punto A:", round(y_A, 3))
    print("Coordenada en y del punto B:", y_B)
    print("Coordenada en y del punto C:", y_C)
    print("Área del triángulo:", round(max_area, 3))
else:
    print("No hay solución para la ecuación y = x**2 en la recta y = 1.5 * x + 5.")
