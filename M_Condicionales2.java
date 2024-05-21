package PrimerosPasos;

import java.util.*;
import javax.swing.*;

public class M_Condicionales2 {
	
	public static void main (String [] args) {
		
		/*Vamos a averiguar el área de cuatro figuras geométricas sencillas. Vamos a diseñar un programa que
		nos diga el área de un cuadrado, el área de un rectángulo, de un triángulo y de un círculo. Para todo
		esto vamos a pedirle al usuario los datos correspondientes. Como interfaz de entrada y salida vamos a
		utilizar tanto la consola como el objeto JOptionPane. La consola la vamos a utilizar para que el usuario
		elija la figura. */
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
			
			//Vamos a almacenar en una variable de tipo entero para que el usuario elija la opción.
			
			int figura=entrada.nextInt();
			
			/*Aquí es donde vamos a utilizar la estructura Switch para evaluar qué opción elegirá el usuario.
			
			Condicional Switch
			 
			  Switch (valor a evaluar){
			  
			 	Case valor1:
			 		Código a ejecutar;
			 		Break;
			 
			  	Case valor2:
			 		Código a ejecutar;
			  		Break;
			   }
			   
			 */
			
			switch (figura) {
			
			case 1:
				
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
				System.out.println("El resultado del area del cuadrado es "+Math.pow(lado, 2));
				
			break; //Siempre es preciso cerrar los casos de un Switch con un break.
			
			case 2:
				
				int base=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la base: "));
				int altura=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la altura: "));
				
				System.out.println("El area del rectangulo es "+base*altura);
				
			break;
			
			case 3:
				
				base=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la base: "));
				altura=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la altura: "));
				
				System.out.println("El area del triangulo es "+(base*altura/2));
				
			break;
				
			case 4:
				
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				
				System.out.printf("%1,2f", Math.PI*(Math.pow(radio, 2))); //Printf premite imprimir con formato.
				
			break;
			
			default:
				
			System.out.println("La opcion introducida no es correcta.");
			
			}
		}	
		
	}

}
