
                                                  #########Ejercicios################

##########Ejercicio 1###############
#Resolver la Ecuacion "((c+5)(b2-3ac)a2)/4a" pidiendo datos

print("Esta es un algoritmo para resolver la ecuacion: ((c+5)(b2-3ac)a2)/4a")

a=float(input("Valor de a: ")) #Pedimos el valor de las variables
b=float(input("Valor de b: "))
c=float(input("valor de c: "))
p1=c+5                      #Resuelvo por partes la ecuacion
p2=(b**2-3*a*c)
p3=4*a
solucion=(p1*p2*(a**2))/p3  #Resuelvo la ecuacion completa
print(f"La respuesta es: {solucion}") #imprimo el resultado

############ EJERCICIO 2 ############
#CREAR UN ALGORITMO PARA INTERCAMBIAR VARIABLES

print("algoritmo para intercambiar el valor de las variables")
a=input("a: ")
b=input("b: ")
a,b=b,a  #CON ESTO INTERCAMBIAMOS LOS VALORES DE LAS VARIABLES
print(f"El nuevo valor de b es: {b}")
b=a
print(f"El nuevo valor de a es: {a} ")


############# EJERCICIO 3 ##############
#OBTENER EL AREA Y LONGITUD DE UN CIRCULO
#FORMULA DEL AREA: PI*R2; FORMULA DEL DIAMETRO: 2*IP*R

import math #PEDIMOS LA FUNCION MATEMATICA CONO IMPORT
r=float(input("radio(u): "))
area=math.pi*(r**2)  #fORMULA DEL AREA CON LA FUNCION MATH, PARA RESULTADOS MAS EXACTOS
longitud=2*math.pi*r #LONGIRUD CON EL VALOR DE PI EXACTO

print(f"El area del circulo es: {area:.2f} u2") #:.nf es igual al numero de decimales que queramos imprimir
print(f"La longitud del circulo es {longitud:.2f} u")

######### EJERCICIO 4 ##########
#Obtener el valor final que se tiene que pagar si se aplica el 36%
#De descuento del total de la compra
print("Valor final con descuento")
valInit=float(input("Valor Inicial: "))
descuento=float(input("Descuento a aplicar: "))
valDesc=(valInit*descuento)/100
valFin=(valInit-valDesc)
print(f"Valor final con Descuento: {valFin:.2f}")

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

############Ejercicio 7############
#crea un programa que compare dos nombres, y verificar si hay coincidencia o no, si es que ambos
#nombres comienzan con la misma letra o sí terminan con la misma letra
nombre1=input("ingrese un nombre a comparar: ")
nombre2=input("ingrese otro nombre a comparar: ")
if nombre1[0]==nombre2[0] or nombre1[-1]==nombre2[-1]: #ENCERRAR ENTRE CORCHETES UN NUMERO DEFINE LO QUE SE VA A ANALIZAR
    print("Ambos nombres coinciden")                   #0, REPRESENTA EL PRIMER VALOR DENTRO DE LA VARIABLE, ES COMO VER UNA MATRIZ
else:                                                  #-1, EL ULTIMO
    print("no hay coicidencia")

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
    
