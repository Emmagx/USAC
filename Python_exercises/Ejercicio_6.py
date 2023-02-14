##############Ejercicio 6###############
#Hacer un programa que pida tres numeros y defina cual es el mayor
p1=float(input("Numero 1: "))
p2=float(input("Numero 2: "))
p3=float(input("Numero 3: "))

if p1>p2 and p1>p3:
    print(f"{p1} es mayor")
elif p2>p1 and p2>p3:
    print(f"{p2} es mayor")
elif p3>p2 and p3>p1:
    print(f"{p3} es mayor")

else:
    print("todos los numeros son iguales")