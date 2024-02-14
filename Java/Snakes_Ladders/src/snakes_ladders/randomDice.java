
package snakes_ladders;

public class randomDice {
    private int[] posicionesTrampas;
    static int dado;
    static int cosenoCase;
    static int matrizCase;
    static int trampa;
    static private boolean posicionesGeneradas = false;
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
            posicionesTrampas = new int[9]; // Establecer 9 posiciones para las trampas, por ejemplo
            for (int i = 0; i < posicionesTrampas.length; i++) {
                posicionesTrampas[i] = (int) (Math.random() * 22) + 2; // Generar posiciones aleatorias entre 2 y 24
            }posicionesGeneradas = true;
        }
        return posicionesTrampas;
    }
        
        public int [] trampasMid(){
        int[] trampas = new int[4]; // Crear un arreglo para almacenar las trampas, asumiendo un máximo de 4 trampas
            int Ntrampas = (int) (Math.random() * 3) + 2; // Generar un número aleatorio entre 2 y 4 para el número de trampas

            for (int i = 0; i < Ntrampas; i++) {
                trampas[i] = (int) (Math.random() * 7); // Generar números aleatorios para las posiciones de las trampas
            }

            return trampas;}
                
        public int [] trampasHard(){
        int[] trampas = new int[4]; // Crear un arreglo para almacenar las trampas, asumiendo un máximo de 4 trampas
            int Ntrampas = (int) (Math.random() * 3) + 2; // Generar un número aleatorio entre 2 y 4 para el número de trampas

            for (int i = 0; i < Ntrampas; i++) {
                trampas[i] = (int) (Math.random() * 24); // Generar números aleatorios para las posiciones de las trampas
            }

            return trampas;}
        
}
