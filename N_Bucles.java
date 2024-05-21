package PrimerosPasos;

import javax.swing.*;

public class N_Bucles {

	public static void main(String[] args) {
		
		
		/*Los bucles en java son parte de las estructuras de control de flujo se dividen en dos categorías: bucles indeterminados
		 * y bucles determinados. Entre los bucles indeterminados tenemos While y Do - While, y entre los bucles determinados, 
		 * tenemos For y For - each.
		 * 
		 * La función del bucle es repetir una serie de líneas de código dentro de un programa. Los bucles indeterminados
		 * son aquellos que, hasta ejecutemos el programa, no sabemos cuántas veces se repetirá el bucle. Mientras que los
		 * bucles determinados son aquellos en los que se sabe cuántas veces se va a repetir el código que está en su interior.
		 */
		
		/*Vamos a empezar el bucle While:
		 
		 While (CONDICIÓN){ <- Dentro de las llaves van las líneas de código que queremos que se repitan X veces.
		 
		 - Linea 1
		 - Linea 2
		 - Linea 3
		 - Linea 4
		 
		 }
		 
		 Cuando la condición que está evaluando el bucle WHILE deje de ser correcta, pase a ser FALSE, dejará de ejecutar las líneas
		 del interior y el programa continuará. Puede ser que, de entrada, la condición sea FALSE, o darse el caso de que la condición
		 nunca deje de ser cierta y se ejecutaría un bucle infinito.
		 */
		
		String clave="Alvaro";
		
		String pass ="";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta.");
				
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
		
	}
}
