package PrimerosPasos;

import java.util.*;

public class L_Condicionales1 {
	
	public static void main(String [] args) {
		
		/* En Java contamos con dos estructuras para modificar el flujo de ejecución de un programa.
		 * o bien dando saltos, o repitiendo código: en caso de dar un salto, se usa un condicional,
		 * pero si queremos repetir unas líneas de código, se usa un bucle.
		 * 
		 * Como condicional tenemos:
		 * 
		 * Condicional if
		 * 
		 * if(condicion){
		 * 
		 * 		Código a ejecutar si la condición es verdadera (true)
		 * 
		 * }
		 * 
		 * El condicional if puede acompañarse de una estructura que se conoce como else, pero no es obligatoria.
		 * También se puede acompañar por la estructura default.
		 * 
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();
		
		if (edad<18) {
			System.out.println("Eres menor de edad.");
		} else {
			System.out.println("Eres mayor de edad.");
		}
		
		/*Modifica el control del flujo de ejecución porque pega saltos: cuando el programa llega a la edad, evalúa si es verdad.
		Si lo es, ejecuta lo que hay dentro del if y si no, ignora el if y ejecuta lo que hay dentro del else. */
		
		// Cuando hay que evaluar muchas condiciones, hay varias opciones: o se hacen varios if o elseif.
		 
		
		if (edad<18) {
			System.out.println("Eres adolescente.");
		} else if (edad<40) {
			System.out.println("Eres joven.");
		} else if (edad<65) {
			System.out.println("Eres joven.");
		} else if (edad>65) {
			System.out.println("Eres anciano.");
		}

}
}