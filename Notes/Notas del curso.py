texto="Hello again"
print(texto) ##print imprime en pantalla lo que necesitemos, entre comillas podemos colocar textos, tambien se pueden agregar variables con cualquier tipo de valor
print(type(texto))  ##type nos muestra que tipo de datos usamos: Boolean, Aritmeticos o Strings

n1=0  #De esta manera se declaran las variables 'nombre'='valor'
n2=1  #El valor puede ser un string(caracteres), Numericos o buleanos
n3=2

suma=n1+n2  #Las variables tambien puede tener operaciones como valor, siempre respetando
mult=n1*n2  #la jerarquia de signos en Matematica
div=n2/n3
print("Esta es una suma entre n1 y n2 =", suma)
print("Esta es una multiplicacion entre n1 y n2 =",mult)
print("Esta es una division entre n2 y n3 =",div)

####################Esta es una practica###################
'''
Comentario multilineas 
'''


############Datos Aritmecticos###############
# // division entera, **potencia, % modulo o sea residuo entero
divent=n1//n2
pot=n2**n1
module=n2%n3
print("Division con resultado entero =",divent)
print("Es una potenciacion entre n2 y n1 =", pot)
print("Esta es una operacion compleja =", (divent/pot)**(suma*5))
print("Modulo es =", module)

###################Operadores Relacionales###########################
'''
== Igual que            #Respetar la sintaxis y el orden de los operadores racionales
!= Distintio que
<  menor que
>  Mayor que
<= Menor o igual que
>= Mayor o igual que 
'''
n4= 50!=50
n5= 50>=0
n6= 60==2
print(n6) #Deberia imprimir un valor Falso
print(n5) #Deberia imprimir un valor Verdadero
print(n4) #Deberia imprimir un valor falso

############OPERADORES LOGICOS##########
'''
and: Se cumplen ambos
or: Se cumple una
not: no a
'''
R=((n1<n2) and (n2==n3))
R1=((n1<n2) or (n2==n3))
R2=not((n1<n2) or (n2==n3))
print("Operacion And", R) 
print("Operacion or", R1)
print("Operacion Nor", R2)

############Operadores de Asignacion#####
n7=0 #Declaras la variable a cambiar valor
#n7=n7+1
n7+=1 #Le sumamos uno a la variable Valor actual=1
n7-=3 #Le restamos tre a la variable, Valor actual=-2
n7*=3 #Multiplicamos la variable por tres, valor actual=-6
n7/=2 #dividimos la variable, valor actual=-3
n7**=4 #potenciamos la variable a 4, Valor actual=81
n7%=4 #Modulamos el valor de la variable, valor actual = 1.0
print(n7) #imprimimos el ultimo valor de n7
print("Operación aritmetica compleja con diferentes valores=", (n7/((n2*n5)**n3)+5.3))

############Salidas de Datos##############
app="Flutter"
proyecto="Conflu"
print(f"se hara en {app} se llamará {proyecto} ") #Podemos utilizar f antes de las comillas para agregar variables entre llaves 
                                                  #E imprimir su valor

############Entradas de Datos#############
entrada= input("¿Como se Llama tu proyecto?: ") #Utilizamos input para pedir el valor que tendra la variable, con un texto que defina que queremos que tenga la llave
print(f"Tu proyecto se llama {entrada}") #Imprimos el valor de la variable que llenamos, esto no aplica a numeros.
'''
print(f"Tu proyecto se llama {entrada+116}") #Ejemplo de que no se puede realizar, tira error
'''
entrada=int(input("Cual es la version de tu proyecto: ")) #Para arregarlo declaras como entero(int) la variable que solicitas
print(f"La version es {entrada}") #Aqui ya hay una entrada de enteros   
print(f"Suma de la entrada y 6 = {entrada+6.6}")#ya se puede operar los numeros que hayamos pedido, se pueden sumar decimales

entrada=float(input("version con decimales: ")) #Declaramos la entrada como un decimal (float)
print(f"Esta es una version exacta con decimales = {entrada}") #imprimimos el dato en decimal
print(f"Esta es una version exacta con decimales mas 1.1 = {entrada+1.1}") #podemos sumarle en decimales 

##############CONDICIONALES#############
#CONDICIONAL IF
prueba=float(input("Ingresar un valor: "))

if prueba>0:
    print("El valor es mayor a cero")

elif prueba==0:
    print("resultado cero")

else:
    print("Resultado negativo")

#############Arrays listas###########
#En python para crear una lista solo se tienen que colocar los objetos dentro de corchetes
#Las listas pueden ser con diferentes tipos de datos, basicamente una lista/array es una variable con varios valores
#Para llamar dato por dato se usan indices, los indices son los numeros de cada objeto dentro de un array
#Empieza de cero hasta -1 que es el ultimo objeto, para llamar desde el ultimo objeto, empezamos desde -1 y asi consecutivamente.
lista=["Futbol", 234, 1.23, [16, "1"], True]   #Ejemplo de un array
print(lista)                                   #Imprime la lista entera
#print(lista[4[2]])                             #Imprime un solo objeto de la lista, en este caso esta llamando a un objeto dentro de una lsita objeto
print(lista[0:3])                              #Imprime una rango de la lista, el primer numero es el inciio, el segundo es hasta que NO
                                               #De objeto a ir, empezando desde el 1
print(lista[:3])                               #Lo mismo que lo anterior, pero sin el 0, python interpreta como cero el dejar en blanco
print(lista[2:])                               #Esto es interpretado como desde el indice hasta el final

###########Funciones en listas#########
print(len(lista))                              #Funcion que cuenta el numero de objetos dentro de una lista
lista.append("dato que podemos agregar")       #Agregar un dato a la lista, es append, lo agrega al final por default
lista.insert(0, "Va luego del indice 0")       #Podemos definir el orden en el que se agregara el nuevo dato
lista.extend([1, 2, 3])                        #Datos agregados por bloque, en este caso en van desde el ultimo indice

lista2=(1, 2, 3, "Hola")
#lista3=lista+lista2                            #Concatenar dos listas o mas
#print(lista3)
print("Futbol" in lista)                       #Así se busca un dato en un array, con IN, minusculas, te dara un valor booleano
print(lista.index("Futbol"))                   #Devuelve el indice del objeto buscado
print(lista.count("Futbol"))                   #Cuenta cuantas veces se repite el mismo valor 
lista.remove("Futbol")                         #Elimina el valor, solo elimina 1 a la vez
lista.clear()                                  #Elimina todo los datos dentro de una lista
lista.reverse()                                #Cambia el orden de los objetos, los ultimos de vuelven los primeros y los primeros los ultimos
lista.sort()                                   #Reordena los datos de mayor a menor
lista.sort(reverse=True)                       #Reordena los datos de menor a mayor

#############Bucles##############
#While == mientras que
#Un bucle es un fragmento de codigo que se repetira hasta cumplir cierta condicion
#SINTAXIS
whilep = 0
while whilep <= 10:
    print(whilep)
    whilep+=1

#for: para esto
data=[1, 2, 3, 4, 5, "Frank", 7] #for recorrera la misma cantidad de datos que tenga la matriz, diccionario o cadena
#for i in [1, 2, 3, 4, 5, 6, 7 ]: 
for i in data:
    print(f"objeto : {i}")

diccionario = {"Brayan":22, "Alejandro":33, "Alex": 21}
for h in diccionario:
    print(f"Nombre: {h}, Edad: {diccionario[h]}", end=" ") #end="" es una manera de quitar el espacio que se crean entre prints y poder imprimir todo en una sola linea
#con el primer {h} solo llamo la clave en la que esta posicionado la variable, con {diccionario[h]} llamo a la definicion de dicha clave con el valor 
#actual de h
#CONJUNTOS #En conjuntos se usan las llaves
conjunto1={1,2,3,4} #Estructura de un conjunto
conjunto2={2,3,5,6}
conjunto3={4,3,6,7}
print(conjunto1==conjunto2) #in bolean value, evalua que sean completamente iguales
print(conjunto1|conjunto2) #Union de dos o mas conjutos A union B, une solo una vez cada valor, si tiene repetidos, no los coloca.
print(conjunto1&conjunto2) #interseccion entre conjuntos A interseccion B, evalua que valores tienen en común.
print(conjunto1-conjunto2) #Todo conjunto que tenga conjunto1 pero no conjunto2
print(conjunto2-conjunto1) #Todo conjunto que tenga conjunto2 pero no conjunto1
print(conjunto1^conjunto2) #Diferencia simetrica entre conjuntos, todos lo valores que no sean interseccion.

