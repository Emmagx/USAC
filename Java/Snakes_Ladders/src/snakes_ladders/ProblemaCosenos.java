package snakes_ladders;
public class ProblemaCosenos {
    int resultadosCosenos;
    //Formula c**2=a**2 + a*b * cos(C)
    //Datos por triangulo:
    //Triangulo 1:
    double ladoA;
    double [] rightAnswer;
    double ladoC;
    double ladoB;
    double alpha, beta, gama;
        public double [] case1Coseno(){
            ladoA = 15; 
            ladoC = 20; 
            alpha = 25;
            //lado B
            ladoB = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - 2*ladoA*ladoC*Math.cos(alpha));
            //angulo B
            beta = Math.acos((Math.pow(ladoB, 2) - Math.pow(ladoA, 2) - Math.pow(ladoC, 2))/ (2*ladoA*ladoB));
            //angulo C
            gama = Math.acos((Math.pow(ladoC, 2) - Math.pow(ladoA, 2) - Math.pow(ladoB, 2))/ (2*ladoA*ladoC));
            rightAnswer[0] = ladoB;
            rightAnswer[1] = Math.toDegrees(beta);
            rightAnswer[2] = Math.toDegrees(gama);
            return rightAnswer;
    }
        public double[] case2Coseno(){
            ladoB = 10; 
            ladoC = 25; 
            beta = 30;
            //lado A
            ladoA = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - 2 * ladoB * ladoC * Math.cos(beta));
            //angulo alpha
            alpha = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC));
            //angulo C
            gama = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoA, 2) - Math.pow(ladoC, 2)) / (2 * ladoB * ladoA));
            rightAnswer[0] = ladoA;
            rightAnswer[1] = Math.toDegrees(alpha);
            rightAnswer[2] = Math.toDegrees(gama);
            return rightAnswer;        
    }
        public double [] case3Coseno(){
            ladoA = 18; 
            ladoB = 25; 
            gama = 30;
            //lado B
            ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - 2 * ladoA * ladoB * Math.cos(gama));
            //angulo B
            alpha = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            //angulo C
            beta = Math.acos((Math.pow(ladoC, 2) + Math.pow(ladoA, 2) - Math.pow(ladoB, 2)) / (2 * ladoC * ladoA));
            rightAnswer[0] = ladoC;
            rightAnswer[1] = Math.toDegrees(alpha);
            rightAnswer[2] = Math.toDegrees(beta);
            return rightAnswer;
    }
    public int resultadosCosenos(){
    
        return resultadosCosenos;
    
    }
    
}
