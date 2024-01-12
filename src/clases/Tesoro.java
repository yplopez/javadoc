package clases;

import java.util.Random;
/**
 * Clase que pinta un tablero y permite hacer movimientos o jugadas dentro de él. 
 */
public class Tesoro {
	/**
	 * Atributo constante de tipo entero inicializado al tamaño del tablero.
	 */
	public static final int TAM_TABLERO = 5;
	/**
	 * Atributo de tipo entero para almacenar el valor de la coordenada x.
	 */
	static int xTesoro;
	/**
	 * Atributo de tipo entero para almacenar el valor de la coordenada y.
	 */
	static int yTesoro;
	/**
	 * Atributo que almacena la posición del jugador en el eje x que para este caso es arriba-abajo.
	 */
	int xJugador = 1;
	/**
	 * Atributo que almacena la posición del jugador en el eje y que para este caso es derecha-izquierda.
	 */
	int yJugador = 1;
	/**
	 * Función que genera los valores de las coordenadas de manera aleatoria y los asigna a los atributos de tipo entero
	 * xTesoro e yTesoro.
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}
	/**
	 * Función que pinta el tablero y la ficha del jugador.
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}
	/**
	 * Función que determina el movimiento de la ficha de acuerdo al parámetro que recibe.
	 * @param movimiento recibe una cadena que indica el movimiento de la ficha.
	 * @return el valor entero de la variable res.
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}
	/**
	 * Función de tipo booleana que evalúa si la posición de la ficha está en la misma posición del tesoro o no.
	 * @return true o false.
	 */
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
