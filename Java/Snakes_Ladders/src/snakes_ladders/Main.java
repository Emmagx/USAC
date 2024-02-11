package snakes_ladders;

/**
 *
 * @author Emmag
 */
//This is for tests.
public class Main {
    static int opcion;
    static Matrices matrices = new Matrices();
        
        
//    static int [][] matriz1Suma = { {7, 48, 5, 0, 1},
//                            {57, 8, 4, 6, 14},
//                            {0, 5, 6, 78, 15},
//                            {21, 14, 8, 19, 54},
//                            {32, 20, 26, 47, 12}};
//    
//    static int [][] matriz2Suma = { {9, 5, 2, 1, 8},
//                            {4, 2, 3, 47, 8},
//                            {48, 55, 32, 19, 6},
//                            {7, 56, 32, 19, 6},
//                            {32, 87, 0, 1, 7}};
    static int [][] matriz1 = new int [5][5];
    public static void main(String[] args) {
        matrices.resultados(matrices.matriz1Suma(), matrices.matriz2Suma());
}
    
    }   

//////Principal code
//public class Main{
//    static int opcion;
//    static Juego juego = new Juego();
//    static Menu menu = new Menu();    
//    public static void main(String[] args) {
//       
//       //Guardamos el return de nuestro metodo que esta dentro del archivo Menu.java en la variable opcion.
//       opcion = menu.menu();
//       System.out.println("Opcion: " + opcion);
//       //Declaramos que vamos a hacer con cada opcion que tengamos.
//       switch(opcion){
//           //Iniciamos el juego:
//           case 1 -> {
//              juego.JuegoPrincipal();
//           }
//               
//           case 2 -> {
//           
//           }
//           case 3 -> {
//           System.out.println("saliendo del programa");
//           System.exit(0);
//}
//       }
//    }
//}
