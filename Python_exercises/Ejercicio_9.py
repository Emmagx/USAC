#####EJERCIO #9########
##Realizar un código que muestre la sumatoria de todos los numero entre el 0 y el 100
suma=0 #Declaro la variable a usar
for i in range(51): #abro bucle 
    suma=suma+i
    i+=1  
    print(f"La suma es: {suma}")
print(f"La suma es: {suma}")

suma2=0
rango=[0,1,2,3,4,5,6,7,8,9,10,
       11,12,13,14,15,16,17,18,19,20,
       21,22,23,24,25,26,27,28,29,30,
       31,32,33,34,35,36,37,38,39,40,
       41,42,43,44,45,46,47,48,49,50]
for i in rango:
    suma2=suma2+i
    i+=1 
    print(f"La suma es: {suma2}") 
print(f"La suma es: {suma2}")