package snakes_ladders;

/**
 *
 * @author Emmag
 */
//This is for tests.
//public class Main {
//    static int opcion;
//    static Matrices matrices = new Matrices();
//    static int [][] matriz1 = new int [5][5];
//    public static void main(String[] args) {
//        matrices.resultadoDivision(matrices.matriz1Div(), matrices.matriz2Div());
//}  
//    }   

//////Principal code
public class Main{
    static int opcion;
    static Juego juego = new Juego();
    static Tablero tablero = new Tablero();
    static Menu menu = new Menu();
    static int position;
    public static void main(String[] args) {
       
       //Guardamos el return de nuestro metodo que esta dentro del archivo Menu.java en la variable opcion.
       opcion = menu.menu();
       System.out.println("Opcion: " + opcion);
       //Declaramos que vamos a hacer con cada opcion que tengamos.
       switch(opcion){
           //Iniciamos el juego:
           case 1 -> {
              position = 1;
              juego.JuegoPrincipal();
           }

           case 3 -> {
           System.out.println("saliendo del programa");
           System.exit(0);
}
       }
    }
}
