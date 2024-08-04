package snakes_ladders;
import java.util.Scanner;
/**
 *
 * @author Emmag
 */

public class Menu {
    public int opcion;
    static Juego juego = new Juego();
    Scanner scanner = new Scanner(System.in);
    public int menu(){
        opcion=0;
        while(opcion == 0){
        System.out.println("Bienvenido al juego de Escaleras y serpientes matematico");
        System.out.println("1. Iniciar");
        System.out.println("2. Datos del estudiante");
        System.out.println("3. Salir");
        opcion = scanner.nextInt();
        if (opcion < 1 && opcion > 3){
            System.out.println("Opcion Incorrecta");
            opcion = 0;
        }
        if (opcion == 2){
           System.out.println("Brayan Emanuel Garcia");
           System.out.println("Carnet: 202300848");
           System.out.println("Brayan Emanuel Garcia");
           System.out.println("1. atras");
           int caso = scanner.nextInt();
           if (caso == 1){
               opcion = 0;
           }
           while (caso != 1) {
               System.out.println("Opcion Incorrecta");
               System.out.println("1.Salir");
               caso = scanner.nextInt();
               opcion = 0;
           }
           }
        }
        return opcion;
    }
    public int menuInGame(){
        opcion=0;
        while(opcion == 0){
        System.out.println("Bienvenido al juego de Escaleras y serpientes matematico");
        System.out.println("1. Iniciar");
        System.out.println("2. Reanudar");
        System.out.println("3. Datos del estudiante");
        System.out.println("4. Salir del juego");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Se iniciara nuevo juego");
                juego.reiniciarJuego();
                juego.JuegoPrincipal();
            }
            case 2 -> {
                System.out.println("Se Reanudara el juego");
                opcion = 2;
                break;
            }
            case 3 -> {
                System.out.println("Brayan Emanuel Garcia");
                System.out.println("Carnet: 202300848");
                System.out.println("Brayan Emanuel Garcia");
                System.out.println("1. atras");
                int caso = scanner.nextInt();
                if (caso == 1){
                    opcion = 0;
                }
                while (caso != 1) {
                    System.out.println("Opcion Incorrecta");
                    System.out.println("1. atras");
                    caso = scanner.nextInt();
                    opcion = 0;
               }
                break;
               }
            case 4 -> {
                System.out.println("Saliendo del programa");
                System.exit(0);
                
            }
        }        
    }   
        return opcion;
    }
}

