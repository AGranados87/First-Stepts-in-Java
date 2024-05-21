package PrimerosPasos;

import java.util.Scanner;

public class J_EntradaEjemplo {
	
	/*Un constructor es un metodo especial, es decir, tiene el mismo nombre 
	que la clase a la que pertenece. Hay clases que tienen un único método
	constructor. Dependiendo de los argumentos que les pases a ese método
	constructor, el objeto que crees será de una forma u otra, un estado
	inicial de una forma u otra. Otra característica que tiene el método
	constructor es que delante del mismo hay que poner la palabra NEW*/
	
	/*La clase Scanner construye un nuevo Scanner que nos va a proporcionar
	 un valor procedente del archivo especificado. El archivo especificado, u origen,
	 va a ser la consola del sistema, es decir: System.in*/
	
	public static void main(String[] args) {
	
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Introduce tu nombre, por favor");
		
		/*Hay que especificar qué tipo de dato es el que hay que introducir por consola para
		poder almacenarlo en una variable.*/
		
		String nombre_usuario = entrada.nextLine(); //Está a la espera de recibir caracteres.
		
		System.out.println("Introduzca su edad, por favor");
		
		int edad = entrada.nextInt(); //Está a la espera de un número entero.
		
		System.out.println("Hi "+nombre_usuario+", next year you will be "+(edad+1)+ " years old");

		entrada.close();
	}
	
	/* Como argumentos del constructor especifica que se tomará como origen la consola del sistema
	para introducir información*/
	
	
}
}
