package snakes_ladders;

public class Tablero {
    String[][] tablero = new String[8][8];
    
 public void tablerito() {
        int contador = 1; // Inicializamos el contador en 1
        // Recorremos las filas del tablero de abajo hacia arriba
        for (int i = tablero.length - 1; i >= 0; i--) {
            // Alternamos el sentido de conteo de los números en las filas pares e impares
            if (i % 2 == tablero.length % 2) { // Filas pares
                // Recorremos las columnas del tablero de derecha a izquierda
                for (int j = 0; j < tablero[i].length; j++) {
                    // Asignamos el número actual al tablero y aumentamos el contador
                    tablero[i][j] = "|" + contador + "|";
                    contador++;
                }
            } else { // Filas impares
                // Recorremos las columnas del tablero de izquierda a derecha
                for (int j = tablero[i].length - 1; j >= 0; j--) {
                    // Asignamos el número actual al tablero y aumentamos el contador
                    tablero[i][j] = "|" + contador + "|";
                    contador++;
                }
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

    