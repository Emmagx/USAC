#############EJERCICIO 5############
#CREAR UN PROGRAMA QUE PIDA DOS NUMEROS Y OBTENGA COMO RESULTADO CUAL DE ELLOS ES PAR O SI AMBOS LO SON
num=int(input("Primer número a evaluar: "))
num2=int(input("Segundo número a evaluar: ")) 

if num%2==0 and num2%2==0:
    print("Ambos numeros son pares")
elif num%2==0 and num2%2!=0:
    print(f"{num} es par")
elif num%2!=0 and num2%2==0:
    print(f"{num2} es par")
else:
    print("ni un numero es par")