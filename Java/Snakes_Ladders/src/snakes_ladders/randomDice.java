
package snakes_ladders;

public class randomDice {
    private int[] posicionesTrampasEz;
    private int[] posicionesTrampasMid;
    private int[] posicionesTrampasHard;
    static int dado;
    static int pos;
    static int cosenoCase;
    static int matrizCase;
    static int trampa;
    static private boolean posicionesGeneradasEz = false;
    static private boolean posicionesGeneradasMid = false;
    static private boolean posicionesGeneradasHard = false;
    public int ranDice(){
        dado = 0;
        while (dado <2 || dado > 6){
            double dado1 = Math.random() * 5;
            dado = (int) dado1;
            dado = (dado + 2);
        }
        System.out.println("Dado:  " + dado);
            return dado;
    }
    
    public int RanCoseno(){
        cosenoCase = 0;
        while (cosenoCase <0 || dado > 2){
            double coseno = Math.random() * 2;
            cosenoCase = (int) coseno;
        }
//        System.out.println("Numero " + cosenoCase);
        return cosenoCase;
}
        public int ranSumaMatriz(){
        matrizCase = 0;
        while (matrizCase < 0 || matrizCase > 2){
            double matriz1 = Math.random() * 2;
            matrizCase = (int) matriz1;
        }
//        System.out.println("Numero " + matrizCase);
        return matrizCase;
}
        
        public int ranDivMatriz(){
        matrizCase = 0;
        while (matrizCase <= 0 || matrizCase > 2){
            double matriz1 = Math.random() * 2;
            matrizCase = (int) matriz1;
        }
//        System.out.println("Numero " + matrizCase);
        return matrizCase;
}
        public int [] trampasEz(boolean condicion) {
        if (condicion) {
            posicionesTrampasEz = new int[9];
            for (int i = 0; i < posicionesTrampasEz.length; i++) {
                posicionesTrampasEz[i] = (int) (Math.random() * 22) + 2;
            }posicionesGeneradasEz = true;
        }
        return posicionesTrampasEz;
    }
        
        public int [] trampasMid(boolean condicion){
        if (condicion) {
            posicionesTrampasMid = new int[10];
            for (int i = 0; i < posicionesTrampasMid.length; i++) {
                pos = (int) (Math.random() * 46) + 2;
                if (pos > 24 && pos < 49){posicionesTrampasMid[i] = pos;}
                
            }posicionesGeneradasMid = true;
        }
        return posicionesTrampasMid;
    }
                
        public int [] trampasHard(boolean condicion){
        if (condicion) {
            posicionesTrampasHard = new int[10];
            for (int i = 0; i < posicionesTrampasHard.length; i++) {
                pos = (int) (Math.random() * 61) + 2;
                if(pos > 48 && pos < 63){
                posicionesTrampasHard[i] = pos;
            }posicionesGeneradasHard = true;
        }
        
    }
    return posicionesTrampasHard;
}
}
