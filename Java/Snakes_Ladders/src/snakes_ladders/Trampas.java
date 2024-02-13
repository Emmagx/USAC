package snakes_ladders;
import java.util.Scanner;
public class Trampas {
    Scanner scanner = new Scanner(System.in);
    randomDice random = new randomDice();
    Matrices matrices = new Matrices();
    ProblemaCosenos cos = new ProblemaCosenos();
    double [][] matrizResultanteDiv;
    double [] cosenoResultante;
    double [] respuestaCorrecta;
    public double [] trampasEz(){
        System.out.println("Buscar lo siguiente: ");
        int trampa = random.RanCoseno();
        System.out.println("Buscar los datos faltante para completar este triangulo, si sabemos que: " );
        switch (trampa){
            case 1 -> {
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
            case 2 ->{
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
            case 3 -> {
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
        System.out.println("Reesolver las siguiente Suma de Matrices");
        
        matrices.imprimirMatrizDivision(matrices.matriz1Div(),matrices.matriz2Div()); 
        return matrizResultanteDiv;
    }
    public double [][] trampasHard(){
        return null;      
    }
}
