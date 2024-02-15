package snakes_ladders;
import java.util.Scanner;

public class Tablero {
    
    static Scanner scanner = new Scanner(System.in);
    String[][] tablero = new String[8][8];
    randomDice random = new randomDice();
    static int contador;
    static Juego juego = new Juego();
    static int problemasEz = 0;
    static int problemasMid = 0;
    static int problemasHard = 0;
    static int errores = 0;
    Main Main = new Main();
    static Trampas traps = new Trampas();
 public void tablerito(String player, int position, int [] trampasEz, int [] trampasMid, int [] trampasHard) {
    
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
            for (int trampaEz : trampasEz) {
                if (contador == trampaEz) {
                    // Concatenamos el símbolo "#" a la celda
                    celda += " # ";
                    break; // Salimos del bucle si encontramos una trampa
                }
            }
            for (int trampaMid : trampasMid) {
                if (contador == trampaMid) {
                    // Concatenamos el símbolo "#" a la celda
                    celda += " # ";
                    break; // Salimos del bucle si encontramos una trampa
                }
            }
            for (int trampaHard : trampasHard) {
                if (contador == trampaHard) {
                    // Concatenamos el símbolo "#" a la celda
                    celda += " # ";
                    break; // Salimos del bucle si encontramos una trampa
                }
            }
            //trampas
            if (celda.contains("#") && (contador) == position && contador < 24){
                boolean condicion = traps.trampasEz();
                    if (condicion == true){
                        problemasEz++;
                    }
                    else{
                        errores++;
                    }
                            }
            if (celda.contains("#") && (contador) == position && contador < 48 && contador > 24){
                boolean condicion = traps.trampasMid();
                    if (condicion == true){
                        problemasMid++;
                            }
                            else{
                                errores++;
                            }}
            if (celda.contains("#") && (contador) == position && contador > 48){
                boolean condicion = traps.trampasHard();
                    if (condicion == true){
                        problemasHard++;
                        }
                        else{
                            errores++;
                        }
                        }        
                    
             celda += " ] ";
             if(errores >= 2){
                 System.out.println("Has cometido 2 errores");
                 System.out.println("Game Over");
                 System.out.println("Ingresa 1 para volver al menu principal Ingresa 2 para terminar el juego");
                 int opcion=scanner.nextInt();
                 if (opcion == 1) {
                    trampasEz = random.trampasEz(true);
                    trampasHard = random.trampasEz(true);
                    trampasMid = random.trampasMid(true);
                    errores=0;
                    juego.reiniciarJuego();
                    Main.main(null);    
                 }
                 else{
                     System.out.println("Saliendo del juego");
                    System.exit(0);}
             }
            // Asignamos la celda al tablero
            tablero[i][j] = celda;

            contador++;
        }
    }

        // Imprimimos el tablero
        for (String[] tablero1 : tablero) {
        for (String tablero11 : tablero1) {
            System.out.print(tablero11); // Imprimimos cada celda del tablero
        }
            System.out.println(); // Imprimimos una nueva línea al final de cada fila
        }
}
}

