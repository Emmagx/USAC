package snakes_ladders;
import java.util.Scanner;

public class Tablero {
    
    static Scanner scanner = new Scanner(System.in);
    String[][] tablero = new String[8][8];
    randomDice random = new randomDice();
    static int contador;
    static Juego juego = new Juego();
//    static int position;
    private int [] trampas;
    Main Main = new Main();
 public void tablerito(String player, int position, int [] trampas) {
    
    contador = 1; // Inicializamos el contador en 1
    
    for (int i = tablero.length - 1; i >= 0; i--) {
        for (int j = (i % 2 == tablero.length % 2) ? 0 : tablero[i].length - 1; 
             (i % 2 == tablero.length % 2) ? j < tablero[i].length : j >= 0; 
             j += (i % 2 == tablero.length % 2) ? 1 : -1) {

            // Inicializamos la celda con el número de la casilla
            String celda = " [ " + contador + " ";
            // Verificamos si el jugador está en esta casilla
            if (contador == position && position < 65) {
                // Concatenamos el símbolo del jugador a la celda
                celda += player + " ";
            }
            

            // Verificamos si la posición actual corresponde a una trampa
            for (int trampa : trampas) {
                if (contador == trampa) {
                    // Concatenamos el símbolo "#" a la celda
                    celda += " # ";
                    break; // Salimos del bucle si encontramos una trampa
                }
            }
             celda += " ] ";

            // Asignamos la celda al tablero
            tablero[i][j] = celda;

            contador++;
        }
    }

    // Imprimimos el tablero
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            System.out.print(tablero[i][j]); // Imprimimos cada celda del tablero
        }
        System.out.println(); // Imprimimos una nueva línea al final de cada fila
    }
}

}
