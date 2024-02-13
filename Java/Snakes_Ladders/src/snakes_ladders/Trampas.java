package snakes_ladders;
import java.util.Scanner;
public class Trampas {
    Scanner scanner = new Scanner(System.in);
    randomDice random = new randomDice();
    Matrices matrices = new Matrices();
    ProblemaCosenos cos = new ProblemaCosenos();
    double [][] matrizResultanteDiv;
    double [] cosenoResultante;
    double [][] matrizResultanteSuma = new double [5][5];
    double [] respuestaCorrecta;
    public double [] trampasEz(){
        System.out.println("Buscar lo siguiente: ");
        int trampa = random.RanCoseno();
        System.out.println("Buscar los datos faltante para completar este triangulo, si sabemos que: " );
        switch (trampa){
            case 0 -> {
                int ladoA = 15; 
                int ladoC = 20; 
                int alpha = 25;
                System.out.println("Lado A" + ladoA);
                System.out.println("Lado C" + ladoC);
                System.out.println("Angulo aplha" + alpha);
                respuestaCorrecta = cos.case1Coseno();
                System.out.println("Lado B");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo Alpha");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo gamma");
                cosenoResultante[2] = scanner.nextFloat();
                break;
                
            }
            case 1 ->{
                int ladoB = 10; 
                int ladoC = 25; 
                int beta = 30;
                System.out.println("Lado B " + ladoB);
                System.out.println("Lado C " + ladoC);
                System.out.println("Angulo beta" + beta);
                respuestaCorrecta = cos.case2Coseno();
                System.out.println("Lado B");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo Alpha");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo gamma");
                cosenoResultante[2] = scanner.nextFloat();
                break;
            }
            case 2 -> {
                int ladoA = 18; 
                int ladoB = 25; 
                int gama = 30;
                System.out.println("Lado A " + gama);
                System.out.println("Lado C " + gama);
                System.out.println("Angulo gamma" + gama);
                respuestaCorrecta = cos.case2Coseno();
                System.out.println("Lado C");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo Alpha");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo betta");
                cosenoResultante[2] = scanner.nextFloat();
                break;   
            }
            default -> {System.out.println("Error"); break;} 
        }
        return cosenoResultante;
    }

    
    public double [][] trampasMid(){
        int trampa = random.ranSumaMatriz();
        System.out.println("Resolver las siguiente Suma de Matrices");
        switch (trampa){
            case 0 -> {
                matrices.imprimirMatrizSuma(matrices.matriz1Suma(), matrices.matriz2Suma());
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                    for (int j = 0; j<matrizResultanteSuma.length; j++){
                        System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                        matrizResultanteSuma[i][j] = scanner.nextDouble();
            }
    }
            }
            case 1 -> {
                matrices.imprimirMatrizSuma(matrices.matriz3Suma(), matrices.matriz4Suma()); 
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextDouble();
                }
    }
            }
            case 2 -> {
                matrices.imprimirMatrizSuma(matrices.matriz5Suma(), matrices.matriz6Suma());
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextDouble();
                }
            }    
        }
            default ->{
                System.out.println("Error");
                    }
        }
        return matrizResultanteSuma;
    }
    public double [][] trampasHard(){
        System.out.println("Resolver las siguientes divisiones de matrices (REDONDEAR RESULTADO A 3 DECIMLAES Y COLOCAR EL SIGNO)");
        int trampa = random.ranDivMatriz();
        switch(trampa){
            case 0 -> {
                matrices.imprimirMatrizDivision(matrices.matriz1Div(), matrices.matriz2Div());
                
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextDouble();
                }
        }                
            }
            case 1 -> {
                matrices.imprimirMatrizDivision(matrices.matriz3Div(), matrices.matriz4Div()); 
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextDouble();
                    }
            }             
            }
            default -> {
                
            }
        }
        return matrizResultanteDiv;      
    }
}
