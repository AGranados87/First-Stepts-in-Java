package PrimerosPasos;

public class S_Arrays1 {
	
	/*Una matriz es una estructura de datos que contiene una colección de valores del mismo tipo. Sirve para almacenar valores que
	tienen una relación entre sí. Cuando necesitamos almacenar no una variable o dos, sino cientos o miles, se suele utilizar este
	método. La sintaxis es la siguiente:
	
	- Declaración : int[] mi_matriz=new int[10]
		
		Como podemos ver el orden es el siguiente:
		
		- El tipo de datos que almacenará la matriz (int) con el doble corchete que inicia la matriz.
		- Siguiente, el nombre de la matriz (mi_matriz)
		- Por último, el operador new, el tipo de datos y el número de valores que almacenará.
		
	- Otra opción sería: int [] mi_matriz=new int[10]={5, 10, 15, 20, 25};
		
		Aquí estaríamos declarando e iniciando la matriz en la misma línea.
		
	Estas dos sintaxis sirven para declarar una matriz, y además, diciendo que va a almacenar datos de tipo entero, diez concretamente.
	Dicho de otra forma, una matriz son una serie de espacios en memoria donde almacenaremos unos valores, todos del mismo tipo. El bucle
	for se suele utilizar bastante a la hora de rellenar las matrices con valores y también a la hora de leer los valores almacenados.
	*/
	
	public static void main (String [] args) {
		
		int [] mi_matriz = new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=10;
		mi_matriz[2]=15;
		mi_matriz[3]=20;
		mi_matriz[4]=25;
		
		System.out.print("");            /*Para sacar los resultados en consola, simplemente escribir el nombre de la matriz 
		                                   y entre corchetes la posición que queremos ver. Si quisieramos imprimir todos,
		                                   habría que imprimir cada posición por separado.*/
		
		//Si nos encontráramos con matrices más grandes, se podrá utilizar un bucle FOR para recorrer los índices de una matriz.
		
		for(int i=0; i<4; i++) {
			
			System.out.println("Valor de la posicion del indice "+i+"="+ mi_matriz[i]);
		}
		
		System.out.println("");
		
		int [] mi_matriz2 = {5, 10, 15, 20, 25};
		
		for(int i=0; i<mi_matriz2.length; i++) {   /*Si queremos contar los elementos de una matriz, podemos usar la propiedad length(), 
			                                         que devuelve la longitud de la matriz.*/
			
			System.out.println("Valor de la posicion del indice "+i+"="+mi_matriz2[i]);
		}
		
		
		
		
	}
	
	
	

}
