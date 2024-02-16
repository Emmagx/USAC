package snakes_ladders;

/**
 *
 * @author Emmag
 */

public class Matrices {
    
    static Matrices matrices = new Matrices();
//Declare all the arrays to use
    static double [][] matriz1Div(){ double [][] matriz1Div = {{5, 10, 1, 3},
                                                        {9, 14, 2, 6},
                                                        {7, 8, 15, 3},
                                                        {6, 8, 9, 2},};
        return  matriz1Div;
                            }
    
    
    static double [][] matriz2Div(){ double [][]matriz2Div = {{5, 13, 9, 4},
                                                        {1, 9, 6, 3},
                                                        {8, 11, 69, 33},
                                                        {25, 6, 7, 4},};
        return matriz2Div;                     
    }
    static double [][] matriz3Div(){double [][] matriz3Div = {{1, 12, 9, 8},
                                                        {7, 6, 3, 2},
                                                        {0, 5, 6, 14},
                                                        {6, 9, 6, 10},};
        return matriz3Div;}
    
    static double [][] matriz4Div(){ double [][] matriz4Div = {{9, 19, 20, 4},
                                                         {12, 33, 6, 8},
                                                         {4, 5, 9, 7},
                                                         {8, 22, 14, 6},};
        return matriz4Div;}
    
    static int [][] matriz1Suma(){ int [][] matriz1Suma =  {{7, 48, 5, 0, 1},
                                                            {57, 8, 4, 6, 14},
                                                            {0, 5, 6, 78, 15},
                                                            {21, 14, 8, 19, 54},
                                                            {32, 20, 26, 47, 12}};
        return matriz1Suma;}
    
    static int [][] matriz2Suma (){ int [][] matriz2Suma = {{9, 5, 2, 1, 8},
                                                            {4, 2, 3, 47, 8},
                                                            {48, 55, 32, 19, 6},
                                                            {7, 56, 32, 19, 6},
                                                            {32, 87, 0, 1, 7}};
        return matriz2Suma;}

    static int [][] matriz3Suma(){ int [][] matriz3Suma = { {4, 9, 7, 45, 18},
                                                            {7, 51, 26, 8, 38},
                                                            {48, 26, 37, 21, 19},
                                                            {1, 0, 6, 8, 1},
                                                            {2, 19, 55, 25, 15}};
        return matriz3Suma;}
    
    static int [][] matriz4Suma(){ int [][] matriz4Suma = { {0, 2, 15, 1, 66},
                                                            {21, 48, 62, 7, 33},
                                                            {4, 88, 0, 68, 4},
                                                            {25, 18, 24, 7, 55},
                                                            {24, 15, 36, 5, 98}};
        return matriz4Suma;}
    
    static int [][] matriz5Suma(){ int [][] matriz5Suma = { {0, 1, 15, 5, 36},
                                                            {1, 78, 65, 32, 4},
                                                            {48, 66, 39, 0, 55},
                                                            {14, 98, 63, 20, 15},
                                                            {11, 39, 84, 7, 1}};
        return matriz5Suma;}
    
    static int [][] matriz6Suma(){ int [][] matriz6Suma = { {78, 25, 66, 48, 98},
                                                            {0, 45, 2, 3, 1},
                                                            {2, 9, 14, 10, 20},
                                                            {35, 87, 65, 2, 32},
                                                            {25, 8, 4, 9, 39}};
        return matriz6Suma;}
    
    static int [][] matrizSuma = new int [5][5];
    static int [][] matrizImpresaSuma;
    static double [][] matrizImpresaDiv;
    static double [][] matrizDivision;
//    static float [][] matrizInversa;
    public int [][] sumaMatriz(int [][] a,int [][] b){
        for (int i=0; i<a.length; i++){
            for (int j = 0; j<a.length; j++){
            matrizSuma[i][j] = a[i][j] + b[i][j];
        }
    }
        return matrizSuma;
}
    public int [][] imprimirMatrizSuma( int a [][], int b[][]){
        for (int i=0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(" [ " + a[i][j]+ " ] ");
                
            }
            System.out.println();
        }
        System.out.println("+");
        for (int i=0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(" [ " + b[i][j]+ " ] ");
            }
            System.out.println();
        }
        System.out.println("=");
        return matrizImpresaSuma;    
    }
    public int [][] resultadosSuma(int [][] a, int [][] b){
    int [][] matriz1 = new int [5][5];
        imprimirMatrizSuma(a, b);
        for (int i=0; i <a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                matriz1 = matrices.sumaMatriz(a, b);
                System.out.print(" [ " + matriz1[i][j]+ " ] ");
                }
            System.out.println("");
            }
        return matriz1;
        }
    
 public double [][] divisionMatriz(double a[][], double b[][]){
        //la division es la multiplicacion entre la matriz a y su inversa.
        double [][] c = matrizInversa(b);
        double[][] matrizDivision = new double[4][4];
        for(int i = 0;i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrizDivision[i][j] = 0;
                for (int k = 0; k<4; k++){
                matrizDivision[i][j] += Math.round((a[i][k] * c[k][j])*1000 )/1000;
                
            }
            } 
        }
        return matrizDivision;
    }

    public double [][] resultadoDivision(double [][] a, double [][] b){
        imprimirMatrizDivision(a,b);
        for (int i=0; i <a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                matrizDivision = matrices.divisionMatriz(a, b);
                System.out.print(" [ " + (matrizDivision[i][j]) + " ] ");
                }
            System.out.println("");
            }
        return matrizDivision;
    }
    public double [][] imprimirMatrizDivision(double [][]a, double b[][]){
        for (int i=0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(" [ " + a[i][j]+ " ] ");
                
            }
            System.out.println();
        }
        System.out.println("/");
        for (int i=0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(" [ " + b[i][j]+ " ] ");
            }
            System.out.println();
        }
        System.out.println("=");

        return matrizImpresaDiv;
    }

    public static double[][] matrizInversa(double[][] a) {
    double s0 = a[0][0] * a[1][1] - a[1][0] * a[0][1];
    double s1 = a[0][0] * a[1][2] - a[1][0] * a[0][2];
    double s2 = a[0][0] * a[1][3] - a[1][0] * a[0][3];
    double s3 = a[0][1] * a[1][2] - a[1][1] * a[0][2];
    double s4 = a[0][1] * a[1][3] - a[1][1] * a[0][3];
    double s5 = a[0][2] * a[1][3] - a[1][2] * a[0][3];

    double c5 = a[2][2] * a[3][3] - a[3][2] * a[2][3];
    double c4 = a[2][1] * a[3][3] - a[3][1] * a[2][3];
    double c3 = a[2][1] * a[3][2] - a[3][1] * a[2][2];
    double c2 = a[2][0] * a[3][3] - a[3][0] * a[2][3];
    double c1 = a[2][0] * a[3][2] - a[3][0] * a[2][2];
    double c0 = a[2][0] * a[3][1] - a[3][0] * a[2][1];

    // Se debe verificar si el determinante es cero
    double invdet = 1.0 / (s0 * c5 - s1 * c4 + s2 * c3 + s3 * c2 - s4 * c1 + s5 * c0);

    double[][] b = new double[4][4];

    b[0][0] = (a[1][1] * c5 - a[1][2] * c4 + a[1][3] * c3) * invdet;
    b[0][1] = (-a[0][1] * c5 + a[0][2] * c4 - a[0][3] * c3) * invdet;
    b[0][2] = (a[3][1] * s5 - a[3][2] * s4 + a[3][3] * s3) * invdet;
    b[0][3] = (-a[2][1] * s5 + a[2][2] * s4 - a[2][3] * s3) * invdet;

    b[1][0] = (-a[1][0] * c5 + a[1][2] * c2 - a[1][3] * c1) * invdet;
    b[1][1] = (a[0][0] * c5 - a[0][2] * c2 + a[0][3] * c1) * invdet;
    b[1][2] = (-a[3][0] * s5 + a[3][2] * s2 - a[3][3] * s1) * invdet;
    b[1][3] = (a[2][0] * s5 - a[2][2] * s2 + a[2][3] * s1) * invdet;

    b[2][0] = (a[1][0] * c4 - a[1][1] * c2 + a[1][3] * c0) * invdet;
    b[2][1] = (-a[0][0] * c4 + a[0][1] * c2 - a[0][3] * c0) * invdet;
    b[2][2] = (a[3][0] * s4 - a[3][1] * s2 + a[3][3] * s0) * invdet;
    b[2][3] = (-a[2][0] * s4 + a[2][1] * s2 - a[2][3] * s0) * invdet;

    b[3][0] = (-a[1][0] * c3 + a[1][1] * c1 - a[1][2] * c0) * invdet;
    b[3][1] = (a[0][0] * c3 - a[0][1] * c1 + a[0][2] * c0) * invdet;
    b[3][2] = (-a[3][0] * s3 + a[3][1] * s1 - a[3][2] * s0) * invdet;
    b[3][3] = (a[2][0] * s3 - a[2][1] * s1 + a[2][2] * s0) * invdet;

    return b;
}

}
