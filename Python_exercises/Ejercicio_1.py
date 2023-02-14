print("Esta es un algoritmo para resolver la ecuacion: ((c+5)(b2-3ac)a2)/4a")
a=float(input("Valor de a: ")) #Pedimos el valor de las variables
b=float(input("Valor de b: "))
c=float(input("valor de c: "))
p1=c+5                      #Resuelvo por partes la ecuacion
p2=(b**2-3*a*c)
p3=4*a
solucion=(p1*p2*(a**2))/p3  #Resuelvo la ecuacion completa
print(f"La respuesta es: {solucion}") #imprimo el resultado