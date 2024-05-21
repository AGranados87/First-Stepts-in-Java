package PrimerosPasos;

import javax.swing.*;

public class K_Entrada_Ejemplo2 {
	
	public static void main (String [] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduzca su nombre");
		
		/*Con esto, hemos construido una ventana show input dialog perteneciente a la 
		clase JOptionPane, en la cual aparecerá ese mensaje, en un cuadro de texto. Lo
		que el usuario escriba en esa ventana aparecerá en consola.*/
		
		System.out.println("Saludos, "+nombre_usuario+". Introduzca su edad");
		
		/*Ahora vamos a pedirle que el usuario introduzca la edad siguiendo el mismo método
		y para eso, necesitamos crear una variable de tipo entero*/
		
		String edad=JOptionPane.showInputDialog("Introduzca la edad, por favor");
		
		/*Como podremos comprobar, nos da un resultado inesperado: en vez de sumar uno a la 
		edad, concatena dichos números porque, para Java, esto no es un número int sino un String
		ya que así lo declaramos.
		
		Para solucionar este problema, se tiene que convertir el String a valor numérico con
		parseInt(edad), perteneciente a la clase Integer. */
		
		int edad1=Integer.parseInt(edad);
		
		System.out.println("Saludos, "+nombre_usuario+". El año que viene tendras "+(edad1+1)+" agnos.");
		
	
	}	

}
