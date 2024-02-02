package tarea1.calculadorausac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        boolean condicion = true;
        while(condicion == true){
            System.out.println("--------------------------------");
            System.out.println("Que operacion desea realizar?\n");
            System.out.println("1. Suma \n");
            System.out.println("2. Resta \n");
            System.out.println("3. Multiplicacion\n");
            System.out.println("4. Division(de numero enteros) \n");
            System.out.println("5. Tablas de multiplicar\n");
            System.out.println("6. Salir\n");
            System.out.println("--------------------------------");
            Scanner scanner = new Scanner(System.in);
                System.out.println("Coloque el numero de opcion(1, 2, 3, 4, 5, 6 ): ");
                int opcion = scanner.nextInt();
                if (opcion>0 && opcion<5){
                    System.out.println("ingrese su primer valor a operar: ");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese su segundo valor a operar: ");
                    num2 = scanner.nextDouble();
                    
                }
                switch (opcion){
                    case 1 -> {
                        double suma = num2 + num1;
                        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es igual a " + suma + "\n");
                    }
                        
                    case 2 -> {
                        double resta = num1 - num2;
                        System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es igual a " + resta + "\n");
                    }
                        
                    case 3 -> {
                        double multiplicacion = num1 * num2;
                        System.out.println("El resultado de la multiplicacion entre " + num1 + " y " + num2 + " es igual a " + multiplicacion + "\n");
                    }
                    case 4 -> {
                        while (num2 == 0){
                            System.out.println("El numero divisor (segundo numero dado) tiene que ser mayor a cero \n");
                            System.out.println("Esriba un nuevo Divisor");
                            num2 = scanner.nextDouble();    
                        }
                        if (num2 != 0){
                            double division = num1 / num2;
                            double residuo = num1 % num2;
                            System.out.println("El resultado de la division entre " + (int)num1 + " y " + (int)num2 + " es igual a " + (int)division + "\n");
                            System.out.println("y su residuo es "+ residuo +"\n");
                        } 
                    }
                    case 5 -> {
                        System.out.println("Ingrese el numero de tabla de multiplicar que quiera5 calcular\n");
                        int tabla = scanner.nextInt();
                        System.out.println("Ahora necesitamos un rango(numero entero). Indique el rango inferior de la tabla de multiplicar \n");
                        int rangeInferior = scanner.nextInt();
                        System.out.println("Indique el rango superior (numero entero)de la tabla de multiplicar \n");
                        int rangeSuperior = scanner.nextInt();
                        while (rangeInferior > rangeSuperior) {
                            System.out.println("El rango es incorrecto. El limite inferior tiene que ser menor que el rango superior \n");
                            System.out.println("Indique el rango inferior de la tabla de multiplicar \n");
                            rangeInferior = scanner.nextInt();
                            System.out.println("Indique el rango superior de la tabla de multiplicar \n");
                            rangeSuperior = scanner.nextInt();
                        }
                        for(int i = rangeInferior; i <= rangeSuperior; i++){
                            int mult = tabla * i;
                            System.out.println(tabla + " * " + i + " = " + mult);
                        }
                        break;
                    }
                    
                    case 6 -> {
                        System.out.println("Gracias por usar mi calculadora!!");
                        System.out.println("Brayan Emanuel Garcia");
                        System.out.println("202300848");
                        System.out.println("contacto: emmagx.dev@gmail.com");
                        return;
                    }
                    default -> System.out.println("La opcion " + opcion + " no existe. ");

            }
        }
    }
}