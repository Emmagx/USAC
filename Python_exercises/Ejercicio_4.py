######### EJERCICIO 4 ##########
#Obtener el valor final que se tiene que pagar si se aplica el 36%
#De descuento del total de la compra
print("Valor final con descuento")
valInit=float(input("Valor Inicial: "))
descuento=float(input("Descuento a aplicar: "))
valDesc=(valInit*descuento)/100
valFin=(valInit-valDesc)
print(f"Valor final con Descuento: {valFin:.2f}")