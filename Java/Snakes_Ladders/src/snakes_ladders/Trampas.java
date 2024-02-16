package snakes_ladders;
import java.util.Scanner;

public class Trampas {
    Scanner scanner = new Scanner(System.in);
    randomDice random = new randomDice();
    Matrices matrices = new Matrices();
    ProblemaCosenos cos = new ProblemaCosenos();
    double [][] matrizResultante = new double [4][4];
    double [] cosenoResultante = new double[3];;
    int [][] matrizResultanteSuma = new int [5][5];
    
    boolean rightAnswer;
    boolean respuestaCorrecta;
    public boolean trampasEz(){
        System.out.println("Buscar lo siguiente: ");
        int trampa = random.RanCoseno();
        System.out.println("Buscar los datos faltante para completar este triangulo, si sabemos que: " );
        switch (trampa){
            case 0 -> {
                System.out.println("Caso 1");
                int ladoA = 15; 
                int ladoC = 20; 
                int alpha = 25;
                System.out.println("Lado A " + ladoA);
                System.out.println("Lado C " + ladoC);
                System.out.println("Angulo aplha " + alpha);
                System.out.println("Ingresar");
                System.out.println("Lado B ");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo beta ");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo gamma ");
                cosenoResultante[2] = scanner.nextFloat();
                if (igualdadCos(cosenoResultante, cos.case1Coseno())){
                System.out.println("Respuesta correcta");
                System.out.println("_________________________________________");
                    respuestaCorrecta = true;
                }
                else {
                    System.out.println("Respueta Incorrecta");

                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                }
                    
                break;
                
            }
            case 1 ->{
                System.out.println("Caso 2");
                int ladoB = 10; 
                int ladoC = 25; 
                int beta = 30;
                System.out.println("Lado B " + ladoB);
                System.out.println("Lado C " + ladoC);
                System.out.println("Angulo beta " + beta);
                System.out.println("Lado A");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo Alpha");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo gamma");
                cosenoResultante[2] = scanner.nextFloat();
                if (igualdadCos(cosenoResultante, cos.case2Coseno())){
                System.out.println("Respuesta correcta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = true;
                }
                else {
                    System.out.println("Respueta Incorrecta");
                                        
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                }
                break;
            }
            case 2 -> {
                System.out.println("Caso 3");
                int ladoA = 18; 
                int ladoB = 25; 
                int gama = 30;
                System.out.println("Lado A " + ladoA);
                System.out.println("Lado B " + ladoB);
                System.out.println("Angulo gamma " + gama);

                System.out.println("Lado C");
                cosenoResultante[0] = scanner.nextFloat();
                System.out.println("Angulo Alpha");
                cosenoResultante[1] = scanner.nextFloat();
                System.out.println("Angulo betta");
                cosenoResultante[2] = scanner.nextFloat();
                if (igualdadCos(cosenoResultante, cos.case3Coseno())){
                System.out.println("Respuesta correcta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = true;
                }
                else {
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                }
                break;
            }
            default -> {System.out.println("Error"); break;} 
        }
        return respuestaCorrecta;
    }

    
    public boolean trampasMid(){
        int trampa = random.ranSumaMatriz();
        System.out.println("Resolver la siguiente Suma de Matrices");
        switch (trampa){
            case 0 -> {
                matrices.imprimirMatrizSuma(matrices.matriz1Suma(), matrices.matriz2Suma());
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                    for (int j = 0; j<matrizResultanteSuma.length; j++){
                        System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                        matrizResultanteSuma[i][j] = scanner.nextInt();
            }
    }
                if (igualdadSuma(matrizResultanteSuma, matrices.resultadosSuma(matrices.matriz1Suma(), matrices.matriz2Suma()))){
                    respuestaCorrecta = true;
                    System.out.println("La respuesta es correcta");
                    System.out.println("_________________________________________");
                }
                else{
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                } break;

            }
            case 1 -> {
                matrices.imprimirMatrizSuma(matrices.matriz3Suma(), matrices.matriz4Suma()); 
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextInt();
                }
    }
                if (igualdadSuma(matrizResultanteSuma, matrices.resultadosSuma(matrices.matriz3Suma(), matrices.matriz4Suma()))){
                    respuestaCorrecta = true;
                    System.out.println("La respuesta es correcta");
                    System.out.println("_________________________________________");
                }
                else{
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                } break;
            }
            
            case 2 -> {
                matrices.imprimirMatrizSuma(matrices.matriz5Suma(), matrices.matriz6Suma());
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultanteSuma.length; i++){
                     for (int j = 0; j<matrizResultanteSuma.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultanteSuma[i][j] = scanner.nextInt();
                }
            }
                if (igualdadSuma(matrizResultanteSuma, matrices.resultadosSuma(matrices.matriz5Suma(), matrices.matriz6Suma()))){
                    respuestaCorrecta = true;
                    System.out.println("La respuesta es correcta");
                    System.out.println("_________________________________________");
                }
                else{
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                }   break;
        }
            default ->{
                System.out.println("Error");
                    }
        }
        return rightAnswer;
    }
    public boolean trampasHard(){
        System.out.println("Resolver las siguientes divisiones de matrices (REDONDEAR RESULTADO A 3 DECIMLAES Y COLOCAR EL SIGNO)");
        int trampa = random.ranDivMatriz();
        switch(trampa){
            case 0 -> {
                matrices.imprimirMatrizDivision(matrices.matriz1Div(), matrices.matriz2Div());
                
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultante.length; i++){
                     for (int j = 0; j<matrizResultante.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultante[i][j] = scanner.nextDouble();
                }
        }
                if (igualdad(matrizResultante, matrices.resultadoDivision(matrices.matriz1Div(), matrices.matriz2Div()))){
                    respuestaCorrecta = true;
                    System.out.println("La respuesta es correcta");
                    System.out.println("_________________________________________");
                }
                else{
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                }                
            }
            case 1 -> {
                matrices.imprimirMatrizDivision(matrices.matriz3Div(), matrices.matriz4Div()); 
                System.out.println("Ingrese los datos de la matriz en el orden solicitado:");
                for (int i=0; i<matrizResultante.length; i++){
                     for (int j = 0; j<matrizResultante.length; j++){
                            System.out.println("Colocar el valor de la casilla " + i +  "," + j);
                            matrizResultante[i][j] = scanner.nextDouble();
                    }
            }
                if (igualdad(matrizResultante, matrices.resultadoDivision(matrices.matriz3Div(), matrices.matriz4Div()))){
                    respuestaCorrecta = true;
                    System.out.println("La respuesta es correcta");
                    System.out.println("_________________________________________");
                }
                else{
                    System.out.println("Respueta Incorrecta");
                    System.out.println("_________________________________________");
                    respuestaCorrecta = false;
                } break;
            }
            default -> {
                System.out.println("Error");
            }
        }
        return rightAnswer;      
    }
    
public boolean igualdad(double[][] a, double[][] b) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] != b[i][j]) {
                return false; // Se encontró al menos un elemento diferente
            }
        }
    }

    return true; // Las matrices son iguales
}
public boolean igualdadSuma(int [][] a, int [][] b){
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] != b[i][j]) {
                return false; // Se encontró al menos un elemento diferente
            }
        }
    }
    return true;
}

public boolean igualdadCos(double [] a, double [] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false; 
        }
    }
        return true;
}
}
