package clases;
/**
 * Clase que determina la superficie y el volumen de una esfera dado su radio. * 
 */
public class Esfera {
	/**
	 * Atributo de tipo double de la clase Esfera para asignarle valor al radio
	 */
	double radio = 1.0;
	/**
	 * Contructor sin parámetros.
	 */
	public Esfera() {
		super();
	}
	/**
	 * Contructor que recibe como parámetro un dato de tipo double.
	 * @param radio recibe un número de tipo double y se lo asigna al atributo radio de la clase.
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Función que mediante una fórmula halla el valor de la superficie de una esfera.
	 * @return retorna el resultado de la fórmula para hallar la superficie.
	 */
	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	/**
	 * Función que calcula el valor del volumen de la esfera mediante una fórmula.
	 * @return retorna el resultado de la fórmula para hallar el volumen. 
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
