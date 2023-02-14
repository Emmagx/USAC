############# EJERCICIO 3 ##############
#OBTENER EL AREA Y LONGITUD DE UN CIRCULO
#FORMULA DEL AREA: PI*R2; FORMULA DEL DIAMETRO: 2*IP*R

import math #PEDIMOS LA FUNCION MATEMATICA CONO IMPORT
r=float(input("radio(u): "))
area=math.pi*(r**2)  #fORMULA DEL AREA CON LA FUNCION MATH, PARA RESULTADOS MAS EXACTOS
longitud=2*math.pi*r #LONGIRUD CON EL VALOR DE PI EXACTO

print(f"El area del circulo es: {area:.2f} u2") #:.nf es igual al numero de decimales que queramos imprimir
print(f"La longitud del circulo es {longitud:.2f} u")
