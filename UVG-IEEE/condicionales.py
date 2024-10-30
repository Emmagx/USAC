#condicionales detectan si una condicion es verdadera o falsa

#si la condicion es verdadera se ejecuta el bloque de codigo que sigue a la condicion
# >, <. >=, <=, ==, !=

edad = 18
if edad >= 18:
    print('eres mayor de edad')
else:
    print('eres menor de edad')

edad = -1
if edad >= 18:
    print('eres mayor de edad')
elif edad < 0:
    print('edad invalida')
else:
    print('eres menor de edad')

# if condicion es verdadera entonces:
#   porcion de codigo a generar
# elif otra condicion se cumple entonces:
#   porcion de codigo a generar
# else si ninguna condicion se cumple entonces
#   porcion de codigo a generar
