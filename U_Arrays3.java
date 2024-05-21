
public class U_Arrays3 {

	public static void main(String[] args) {
		
		/*El siguiente paso será ver las matrices bidimensionales, que no existen como tal sino que se trata de arrays dentro de arrays. En Java
		existen matrices multidimensionales.
		
		Una array unidimensional es como una gran variable donde podemos almacenar varios valores. El array bidimensional consiste en que dentro
		de cada una de las posiciones del array hay otro array que puede tener X posiciones. Dentro de la siguiente posición sería lo mismo, otro
		array con más posiciones. Lo que obtenemos es una tabla. Sin embargo, un array no es una tabla, sino que la tabla sale al representar el
		array en pantalla, un ancho y un alto. Al intentar representar esto, queda como una tabla. Como decíamos, existen arrays multidimensionales,
		donde dentro de cada array de dos dimensiones, habría más. Es complejo de visualizar porque se daría una especie de cubo, y así sucesivamente.
		
		
		Vamos a ver los arrays de dos dimensiones. Vamos a rellenar una matriz bidimensional que va a tener la capacidad de almacenar 20 elementos, con 4 indices en una dimensión y 5 en otra,
		y después la vamos a rellenar de forma manual.
		*/
		
		
		int [][] matriz_bi= new int[4][5];
		
		matriz_bi[0][0]=5;    //Vemos que hay dos indices: uno por dimensión, un total de 20 valores.
		matriz_bi[0][1]=10;
		matriz_bi[0][2]=15;
		matriz_bi[0][3]=20;
		matriz_bi[0][4]=25;
		
		matriz_bi[1][0]=30;
		matriz_bi[1][1]=35;
		matriz_bi[1][2]=40;
		matriz_bi[1][3]=45;
		matriz_bi[1][4]=50;
		
		matriz_bi[2][0]=55;
		matriz_bi[2][1]=60;
		matriz_bi[2][2]=65;
		matriz_bi[2][3]=70;
		matriz_bi[2][4]=75;
		
		matriz_bi[3][0]=80;
		matriz_bi[3][1]=85;
		matriz_bi[3][2]=90;
		matriz_bi[3][3]=95;
		matriz_bi[3][4]=100;
		
		/*Como podemos ver, lo más sencillo sería visualizar una tabla, pero esto no es así. Los elementos de la matriz pueden desordenarse.
		 Lo importante es que todos los valores estén dentro de la matriz, no su orden. Si quisieramos ver un elemento o dos, podemos
		 usar los métodos vistos anteriormente.*/
		
		//Si queremos recorrer toda la matriz, debemos utilizar dos bucles for.
		
		for(int i=0;i<4;i++); {     //Este bucle se va a encargar de recorrer la primera dimensión de la matriz (el 0), que será el primero de dos for anidados.
			
			for(int j=0;j<5;j++) {
			
			System.out.println(matriz_bi[j]);
			
		
			
			}
		}
		
	}	

}
