package PrimerosPasos;

import javax.swing.*;

public class P_Bucles3 {
	
	public static void main (String [] args) {
		
		/*Aquí vamos a ver el bucle do-while. La funcionalidad es muy parecida a la del bloque while pero con un
		 un pequeño matiz: este bucle evalúa la condición después de haber ejecutado el código que hay en su interior.
		 
		 La sintaxis es la siguiente:
		 
		 Do{
		 
		 - Linea 1
		 - Linea 2
		 - Linea 3
		 
		 } while (condición);
		 
		 La diferencia entre while y el bucle do-while es que éste último te asegura que aunque la condición de entrada
		 sea false, lo que hay dentro del bucle se ejecute al menos una vez. El bucle while normal no llega a ejecutarse ni
		 una sola vez 	*/
		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero: (H/M)");
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		/*Le estamos diciendo que ésta instrucción la va a repetir infinitas veces mientras lo que el usuario haya introducido
		en la ventana JOptionPane sea diferente de H o M. Con esto nos aseguramos que el programa tenga que comprobar las dos
		condiciones a la vez para que la condición sea cierta. Es decir, si introduce algo que no sea H o M, no se está
		respondiendo correctamente.*/
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros"));
		
		/* Utilizamos parseInt porque, como recordamos, el método showInputDialog sólo devuelve Strings. El método parseInt devuelve
		el String a valor numérico.*/
		
		int pesoideal=0;
		
       do {
    	   
    	   altura=Integer.parseInt(JOptionPane.showInputDialog("Altura Incorrecta. Introduce la altura de nuevo"));
    	   
		}while (altura<=140 || altura>=230);
		
		
		if(genero.equalsIgnoreCase("M")) {
			
			pesoideal=altura-110;
			
		} else if(genero.equalsIgnoreCase("H")) {
			
			pesoideal=altura-120;
		}
		
		System.out.println("Tu peso ideal es de "+pesoideal+" kilogramos.");
}
}


