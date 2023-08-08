#librerias
import math 
import time

#Variables
denominador = 2
number = float()
print("Bienvenido al juego, te diremos si tu número es par o impar")
time.sleep(1)
print("Quieres empezar el juego?")
pet=input("Si/No: ").lower()
if pet=="si":   
    while True:    
        number=float(input("Inserte un numero: "))
        print("Procesando...")
        time.sleep(3)
        res=math.fmod(number, denominador)
        if res==0:
            print("El número ingresado es par")
            time.sleep(2)
        else:
            print("No es un numero par")
            time.sleep(2)
        print("Quieres Seguir")
        time.sleep(2)   
        pet=input("Si/No: ").lower()
        if pet=="no":
            print("Feliz día!")
            time.sleep(1)
            break
else: 
    print("Opción no válida. Por favor, responde 'Si' o 'No'")