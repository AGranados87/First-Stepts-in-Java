
import javax.swing.*;

public class T_Arrays2 {

	public static void main(String[] args) {
		
	/*Para que fuera más sencillo la construcción de un bucle FOR para recorrer matrices, se diseñó un nuevo método llamado bucle "for each".*/
		
		String [] matriz_paises = new String[8];
		
		matriz_paises[0]="Espana";
		matriz_paises[1]="Irlanda";
		matriz_paises[2]="Noruega";
		matriz_paises[3]="Rusia";
		matriz_paises[4]="Francia";
		matriz_paises[5]="Alemania";
		matriz_paises[6]="Grecia";
		matriz_paises[7]="Finlandia";
		
		for (int i=0; i<matriz_paises.length ;i++) {
			
			System.out.println("Pais "+(i+1)+" "+ matriz_paises[i]);
			
		}
			
		System.out.println(" ");
		
		//Se puede simplificar, como decíamos, con otro bucle for each.
			
		for(String elemento:matriz_paises) {
				
		    System.out.println(elemento);
		}
		
		//En vez de rellenar la matriz a mano, vamos a abrir un cuadro de diálogo para rellenar la matriz.
		
		System.out.println(" ");
		
		String [] animales = new String[8];
		
		for(int i=0;i<8;i++) {
			
			animales[i]=JOptionPane.showInputDialog("Introduce un animal: ");
			
			System.out.println("El resultado numero " +(i+1)+ " de la matriz es "+animales[i]);
		}
		
		System.out.println(" ");
		
		//Por último, vamos a crear una matriz grande que se va a rellenar con números aleatorios.
		
		int [] matriz_tocha = new int [150];
		
		for (int i=0;i<matriz_tocha.length;i++) {
			
			matriz_tocha[i]=(int)Math.round(Math.random()*100);
			
		}
		
		
		for (int numeros:matriz_tocha) {
			
			System.out.println(numeros);
		}
		
		
	}   
	
	

}
