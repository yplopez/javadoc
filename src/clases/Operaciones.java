package clases;
/**
 * Clase que se encarga de realizar diferentes operaciones. 
 */
public class Operaciones {
/**
 * Atributos de tipo double para almacenar el valor de los números.
 */
	double num1;
	double num2;
	/**
	 * Constructor sin parámetros.
	 */
	public Operaciones() {
		
	}
	/**
	 * Constructor que recibe como parámetros dos números de tipo double.
	 * @param num1 parámetro que recibe un número de tipo double para asignarlo a un atributo num1 de la clase.
	 * @param num2 parámetro que recibe un número de tipo double para asignarlo a un atributo num2 de la clase.
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	/**
	 * Función que realiza la operación suma de los valores almacenados en los atributos de la clase.
	 * @return retorna el resultado de la suma de los atributos num1 y num2.
	 */
	public double suma() {
		return num1+num2;
	}
	/**
	 * Función que realiza la operación resta de los valores almacenados en los atributos de la clase.
	 * @return retorna el resultado de la resta de los atributos num1 y num2.
	 */
	public double resta() {
		return num1-num2;
	}
	/**
	 * Función que realiza la operación multiplicación de los valores almacenados en los atributos de la clase.
	 * @return retorna el resultado de la multiplicación de los atributos num1 y num2.
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	/**
	 * Función que realiza la operación división de los valores almacenados en los atributos de la clase y que evalua que
	 * no se esté dividiendo por cero(0).
	 * @return retorna el resultado de la división de los atributos num1 y num2.
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}
	/**
	 * Función que determina cual de los valores almacenados en los atributos de la clase es mayor.
	 * @return retorna el resultado de la comparación de los atributos num1 y num2.
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	/**
	 * Función que determina cual de los valores almacenados en los atributos de la clase es menor.
	 * @return retorna el resultado de la comparación de los atributos num1 y num2.
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
