package clases;

import java.util.Random;
/**
 * Clase con funciones para dar números aleatorios.
 */
public class Aleatorios {
/**
 * Función que genera un número aleatorio entre el número 1 y la cantidad.
 * @param cantidad es un número que fija el limite hasta donde se generará el número aleatorio.
 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}
/**
 * Función que genera un número aleatorio la cantidad de veces y el número máximo que indique el usuario.
 * @param Cantidad número de veces que se va a generar números aleatorios
 * @param max Número hasta el que se pueden generar números aleatorios.
 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}
	
/**
 * Función que genera un número aleatorio la cantidad de veces entre el números mínimo y  número máximo que indique el usuario.
 * @param cantidad número de veces que se va a generar números aleatorios
 * @param minimo Número desde el que se pueden generar números aleatorios.
 * @param maximo Número hasta el que se pueden generar números aleatorios.
 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
