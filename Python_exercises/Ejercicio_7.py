############Ejercicio 7############
#crea un programa que compare dos nombres, y verificar si hay coincidencia o no, si es que ambos
#nombres comienzan con la misma letra o sí terminan con la misma letra
nombre1=input("ingrese un nombre a comparar: ")
nombre2=input("ingrese otro nombre a comparar: ")
if nombre1[0]==nombre2[0] or nombre1[-1]==nombre2[-1]: #ENCERRAR ENTRE CORCHETES UN NUMERO DEFINE LO QUE SE VA A ANALIZAR
    print("Ambos nombres coinciden")                   #0, REPRESENTA EL PRIMER VALOR DENTRO DE LA VARIABLE, ES COMO VER UNA MATRIZ
else:                                                  #-1, EL ULTIMO
    print("no hay coicidencia")
