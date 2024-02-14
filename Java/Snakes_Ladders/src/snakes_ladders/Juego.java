package snakes_ladders;

import java.util.Scanner;

public class Juego {
    static int posicion = 1;
    static String player = "@";
    static randomDice dice = new randomDice();
    static int dado;
    static int action = 0;
    static int game;
    static Menu menu = new Menu();
    
    static Scanner scanner = new Scanner(System.in);
    static Juego juego = new Juego();
    public static void JuegoPrincipal() {
        System.out.println("Bienvenido al juego de serpientes y Escaleras");
        int [] trampasEz = null;
        int [] trampasMid = null;
        int [] trampasHard = null;
        while (action == 0) {
            if (trampasEz == null) { // Si las trampas aún no se han generado
            trampasEz = dice.trampasEz(true); // Genera las trampas
        }
            if (trampasMid == null) { // Si las trampas aún no se han generado
            trampasMid = dice.trampasMid(true); // Genera las trampas
        }
            if (trampasHard == null) { // Si las trampas aún no se han generado
            trampasHard = dice.trampasHard(true); // Genera las trampas
        }
            Tablero tablero = new Tablero();
            tablero.tablerito(player, posicion, trampasEz, trampasMid, trampasHard);
            System.out.println("Acciones Realizables: ");
            System.out.println("1. lanzar dado");
            System.out.println("2. Terminar Juego");
            System.out.println("P. pausar juego");
            String action1 = scanner.next();
            action = action1.charAt(0);
            int asciiValue = (int) action;
            if (posicion > 63){
                        System.out.println("Felicidades has ganado");
                        System.out.println("Selecciona que deseas realizar");
                        System.out.println("1. Volver al menu principal");
                        System.out.println("2. Salir del juego");
                        int opcion = scanner.nextInt();
                        if (opcion == 1){
                            trampasEz = dice.trampasEz(true);
                            trampasHard = dice.trampasEz(true);
                            trampasMid = dice.trampasMid(true);
                            juego.reiniciarJuego();
                            Main.main(null);
                            
                        }

            }
            switch (asciiValue) {
                //Lanzar dado
                case 49:
                    dado = dice.ranDice();
                    posicion += dado;

                    action = 0;
                    break;
                //Salir del Juego
                case 50:
                    System.out.println("Gracias por Jugar");
                    System.out.println("Brayan Emanuel Garcia");
                    System.out.println("202300848");
                    System.exit(0);
                    break;
                //Pausar juego
                case 80: 
                    
                    menu.menuInGame();
                    action = 0;
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    action = 0;
                    break;
            }
        }
    }

    public void reiniciarJuego() {
        this.posicion = 1;
        
    }
}
