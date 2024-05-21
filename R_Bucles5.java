package PrimerosPasos;

import javax.swing.*;

public class R_Bucles5 {
	
	/*Lo primero sería importar el paquete para pedirle al usuario que introduzca un número. Una vez hecho esto, vamos a crear un
	sencillo programa que calcule el facotial del número introducido, otra forma de utilizar el bucle for.*/

	public static void main(String[] args) {
		
		int resultado=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
		
		for (int i=numero;i>0;i--) { //FOR INT I igual a Numero, mientras que i sea mayor que 0, i --.
			
			resultado=resultado*i;
		}
		
		System.out.println("El factorial de "+numero+" es "+resultado);

	}

}
