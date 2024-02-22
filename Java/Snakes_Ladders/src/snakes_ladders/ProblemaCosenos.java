package snakes_ladders;
public class ProblemaCosenos {
    int resultadosCosenos;
    //Formula c**2=a**2 + a*b * cos(C)
    //Datos por triangulo:
    //Triangulo 1:
    double ladoA;
    double [] rightAnswer = new double [3];
    double ladoC;
    double ladoB;
    double alpha, beta, gama;
        public double [] case1Coseno(){
            ladoA = 14; 
            ladoC = 11; 
            alpha = Math.toRadians(34);
            //lado B
            ladoB = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - 2 * ladoA * ladoC * Math.cos(alpha));
            //angulo B
            beta = Math.acos((Math.pow(ladoB, 2) - Math.pow(ladoA, 2) - Math.pow(ladoC, 2)) / (-2 * ladoA * ladoC));
            //angulo C
            gama = Math.acos((Math.pow(ladoC, 2) - Math.pow(ladoA, 2) - Math.pow(ladoB, 2))/ (-2*ladoA*ladoC));
            rightAnswer[0] = Math.round(ladoB *1000)/1000;
            rightAnswer[1] = Math.round(Math.toDegrees(beta)*1000)/1000;
            rightAnswer[2] = Math.round((Math.toDegrees(gama) * 1000) / 1000);
            
           System.out.println("Respuestas correctas caso 1");
           for (int i = 0; i < 3; i++){
               System.out.println(i + "  " + rightAnswer[i]);
           }
                return rightAnswer;
    }
        public double[] case2Coseno(){
            ladoB = 15; 
            ladoC = 30; 
            beta = Math.toRadians(35);
            //lado A
            ladoA = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - 2 * ladoB * ladoC * Math.cos(beta));
            //angulo alpha
            alpha = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC));
            //angulo C
            gama = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoA, 2) - Math.pow(ladoC, 2)) / (2 * ladoB * ladoA));
            rightAnswer[0] = Math.round(ladoA);
            rightAnswer[1] = Math.round(Math.toDegrees(alpha)*1000)/1000;
            rightAnswer[2] = Math.round(Math.toDegrees(gama)*1000)/1000;
           System.out.println("Respuestas correctas caso 2");
           for (int i = 0; i < 3; i++){
               System.out.println(i + "  " + rightAnswer[i]);
           }
//            
            return rightAnswer;        
    }
        public double [] case3Coseno(){
            ladoA = 13; 
            ladoB = 20; 
            gama = Math.toRadians(25);
            //lado B
            ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - 2 * ladoA * ladoB * Math.cos(gama));
            //angulo B
            alpha = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            //angulo C
            beta = Math.acos((Math.pow(ladoC, 2) + Math.pow(ladoA, 2) - Math.pow(ladoB, 2)) / (2 * ladoC * ladoA));
            rightAnswer[0] = Math.round(ladoC *1000)/1000;
            rightAnswer[1] = Math.round(Math.toDegrees(alpha)*1000)/1000;
            rightAnswer[2] = Math.round(Math.toDegrees(beta)*1000)/1000;
           System.out.println("Respuestas correctas caso 3");
           for (int i = 0; i < 3; i++){
               System.out.println(i + "  " + rightAnswer[i]);
           }
            return rightAnswer;
    }
    public int resultadosCosenos(){
    
        return resultadosCosenos;
    
    }
    
}
