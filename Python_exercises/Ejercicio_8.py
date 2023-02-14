#####Ejercicio 8########
#Crear un programa que simule un cajero automatico con un saldo inicial de Q2000, con el siguiente mennú
#1. ingresar dinero
#2. Retirar Dinero  
#3. Mostrar Dinero
#4. Salir
loop = 0
saldo=0
print(f"Bienvenido al Cajero")
while loop==0:
    peticion=int(input("Que desea realizar? 1. ingresar Dinero; 2. Retirar Dinero. 3. Mostrar Dinero. 4. Salir "))
    if peticion==1:
        SalAum=float(input("Inserte cantidad a Ingresar: "))
        saldo+=SalAum
        print(f"Su nuevo Saldo es: {saldo}")
    elif peticion==2:
        SalRes=float(input("Ingrese la cantidad a Retirar: "))
        if SalRes<=saldo:
            saldo-=SalRes
            print(f"Su nuevo saldo es: {saldo}")
        else: 
            print("no cuenta con suficiente saldo")
    elif peticion==3:
        print(f"Su saldo es: {saldo}")
    elif peticion==4:
        print("Usted esta saliendo del cajero")
        salir=int(input("Seguro que quiere salir? 1. CONFIRMAR "))
        if salir==1:
            loop,salir=salir,loop
        else:
            print("Seguiremos en las transacciones")
    else:
        print("Opcion incorrecta")
else:
    print("Gracias por usar el cajero")
    
