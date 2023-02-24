###Proyecto 1, Crear un simulador de cajero automatico, aumentando y subiendo saldos.
import time #Esta libreria me va ayudar a darle un Delay a los mensajes
saldo=0 #Saldo inicial, con una base de datos futura, se busca mejorarla.
print(f"Bienvenido al Cajero")
while True: #Mientras se verdadero
    print("Qué desea realizar?")
    print("1. Ingresar Dinero")
    print("2. Retirar Dinero")
    print("3. Mostrar Saldo")
    print("4. Salir")
    peticion=float(input("Ingrese Numero de petición: "))    
    if peticion==1:
        cantidad=float(input("Inserte cantidad a Ingresar: "))
        if cantidad>0: ##limita que el valor ingresado sea menor a cero.
            saldo+=cantidad
            print(f"Usted ha ingresado {cantidad:.2f} a su cuenta.")
            print(f"Su nuevo saldo es: {saldo:.2f}")
            time.sleep(2) #delay dado, en segundos
        else:
            print(f"La cantidad{cantidad:.2f} es menor a 0. Realice nuevamente la operacion.")            
            time.sleep(2)
    elif peticion==2:
        cantidad=float(input("Ingrese la cantidad a Retirar: "))
        if cantidad>1:
            if cantidad<=saldo:
                saldo-=cantidad
                print(f"Usted Retiró {cantidad:.2f}")
                print(f"Su nuevo saldo es: {saldo:.2f}")
                time.sleep(2)
            else:
                print("su saldo es insuficiente")
                time.sleep(2)
        else: 
            print("La cantidad a retirar debe ser un número positivo")
            time.sleep(2)
    elif peticion==3:
        print(f"Su saldo es: {saldo:.2f}")
        time.sleep(2)
    elif peticion==4:
        print("Usted esta saliendo del cajero")
        confirmacion=input("Seguro que quiere salir? S/N ").lower()
        if confirmacion=="s":
            print("Gracias por usar nuestro ATM")
            time.sleep(2)
            break #ROMPE el bucle si llega a esa opcion.
    else:
        print("Opcion incorrecta")   
        time.sleep(2)