
package snakes_ladders;

public class randomDice {
    static int dado;
    static int cosenoCase;
    static int matrizCase;
    static int trampa;
    public int ranDice(){
        dado = 0;
        while (dado <2 || dado > 6){
            double dado1 = Math.random() * 5;
            dado = (int) dado1;
            dado = (dado + 2);
        }
        System.out.println("Numero " + dado);
            return dado;
    }
    
    public int RanCoseno(){
        cosenoCase = 0;
        while (cosenoCase <0 || dado > 2){
            double coseno = Math.random() * 2;
            cosenoCase = (int) coseno;
        }
        System.out.println("Numero " + cosenoCase);
        return cosenoCase;
}
        public int ranSumaMatriz(){
        matrizCase = 0;
        while (matrizCase <= 1 || matrizCase > 2){
            double matriz1 = Math.random() * 2;
            matrizCase = (int) matriz1;
        }
        System.out.println("Numero " + matrizCase);
        return matrizCase;
}
        
        public int ranDivMatriz(){
        matrizCase = 0;
        while (matrizCase <= 0 || matrizCase > 2){
            double matriz1 = Math.random() * 2;
            matrizCase = (int) matriz1;
        }
        System.out.println("Numero " + matrizCase);
        return matrizCase;
}
        public int trampasEz(){
        trampa = 0;
        while (trampa <= 1 || trampa > 23){
            double trampaPos = Math.random() * 23;
            trampa = (int) trampaPos;
        }
        System.out.println("Numero " + trampa);
        return trampa;}
        
        public int trampasMid(){
        trampa = 0;
        while (trampa < 24 || trampa > 48){
            double trampaPos = Math.random() * 47;
            trampa = (int) trampaPos;
        }
        System.out.println("Numero " + trampa);
        return trampa;}
                
        public int trampasHard(){
        trampa = 0;
        while (trampa < 49 || trampa > 54){
            double trampaPos = Math.random() * 23;
            trampa = (int) trampaPos;
        }
        System.out.println("Numero " + trampa);
        return trampa;}
        
}