#####Ejercicio 8########
#Crear un programa que simule un cajero automatico con un saldo inicial de Q0, con el siguiente mennú
#1. ingresar dinero
#2. Retirar Dinero  
#3. Mostrar Dinero
#4. Salir
import time
saldo=0
print(f"Bienvenido al Cajero")
while True:
    print("Qué desea realizar?")
    print("1. Ingresar Dinero")
    print("2. Retirar Dinero")
    print("3. Mostrar Saldo")
    print("4. Salir")
    peticion=float(input("Ingrese Numero de petición: "))    
    if peticion==1:
        cantidad=float(input("Inserte cantidad a Ingresar: "))
        if cantidad>0:
            saldo+=cantidad
            print(f"Usted ha ingresado {cantidad:.2f} a su cuenta.")
            print(f"Su nuevo saldo es: {saldo:.2f}")
            time.sleep(2)
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
            break
    else:
        print("Opcion incorrecta")   
        time.sleep(2)