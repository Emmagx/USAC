package snakes_ladders;
import java.util.Scanner;
public class Juego {
    static int posicion = 1;
    static String player = "@";
    static Menu menu = new Menu();
    static randomDice dice = new randomDice();
    static int dado;
    static int action = 0;
    static int game;
    static Scanner scanner = new Scanner(System.in);
    public static void JuegoPrincipal(){
        System.out.println("Bienvenido al juego de serpientes y Escaleras");
        while (action == 0){
            Tablero tablero = new Tablero();
            tablero.tablerito(player, posicion);
            System.out.println("Acciones Realizables: ");
            System.out.println("1. lanzar dado");
            System.out.println("2. Terminar Juego");
            System.out.println("P. pausar juego");
            String action1 = scanner.next();
            action = action1.charAt(0);
            int asciiValue = (int) action;
            
            switch (asciiValue){
                //Lanzar dado
                case 49 -> {
                    dado=dice.ranDice();
                    posicion += dado;
                    action = 0;
                }
                //Salir del Juego
                case 50 -> {
                    System.out.println("Gracias por Jugar");
                    System.out.println("Brayan Emanuel Garcia");
                    System.out.println("202300848");
                    System.exit(0);
                }
                //Pausar juego
                case 80 -> { 
                    menu.menuInGame();
                    action = 0;
                    
                }
                default -> {
                    System.out.println("Opcion Invalida");
                    action = 0;
                }
                }
            
            }
            
        }
    public void reiniciarJuego() {
    this.posicion = 1;
}
    
    }
