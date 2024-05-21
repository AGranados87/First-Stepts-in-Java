package PrimerosPasos;

import javax.swing.JOptionPane;

public class Q_Bucles4 {

	public static void main(String[] args) {
		
		/*Vamos a ver los bucles determinados, y empezaremos con el bucle FOR. Como se dijo anteriormente, pertecene a los bucles
		determinados, esto es, aquellos que utilizaremos cuando sabemos cuántas veces se va a repetir algo. La sintaxis es 
		la siguiente:
		
		FOR(inicio bucle, condición, contador bucle){
		
		- Linea 1
		- Linea 2
		- Linea 3
		- Linea 4
		
		}
		
		Vamos a hacer un sencillo programa que nos imprima nuestro nombre en consola 10 veces. Por ello, tendremos que meterlo todo
		en un bucle FOR.
		
		*/
		
		for(int z=0; z<10; z++) {//Utilizamos el operador ++ para indicarle que queremos incrementar de uno en uno
			
			System.out.println("Alvaro");
			
		}
			
		
		/*Vamos a elaborar un programa que evalúe si una dirección de email es correcta o no lo es. Si tiene una arroba se dará por
		válida y si no la tiene, será incorrecta. Vamos a necesitar un método que sea capaz de evaluar dentro de un String de qué
		tipo es un caracter, y para ello vamos a usar el método charAt y el método length(), que devuelve la longitud de una cadena. */
		
		
		@SuppressWarnings("unused")
		boolean arroba=false;
		
		String email=JOptionPane.showInputDialog("Introduzca la dirección de email:");
		
		for(int i=0; i<email.length(); i++) {
			
			System.out.println("El email tiene una longitud de " +email.length()+ " caracteres");
			
			if (email.charAt(i)=='@'){
				
				arroba=true;
			}
		}
		
		if (arroba=true) {
			
			System.out.println("Correcto.");
		} else {
			
			System.out.println("No es correcto");
		}
		
		//

	}

}
