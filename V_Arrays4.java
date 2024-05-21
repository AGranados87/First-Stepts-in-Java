package PrimerosPasos;

public class V_Arrays4 {
	
/* También se pueden introducir los valores de una matriz entre llaves. Para empezar, habría que declarar la matriz, */
	
public static void main(String[] args) {
		
		
		double acumulado;
		double interes=0.10;
		
		//Vamos a representar en Java cómo se refleja ese incremento.
		
		double [][] saldo = new double[6][5];
		
		for(int i=0;i<6;i++) {
			
			saldo[i][0] = 10000;
			acumulado= 10000;
			
			for(int j=1;j<5;j++) {
				
				acumulado=acumulado+(acumulado*interes);
				
				saldo[i][j]=acumulado;
			}
			
			interes=interes+0.01;
		}
		
		for(int z=0;z<6;z++) {
			
			System.out.println();
			
			for(int h=0;h<5;h++) {
				
				System.out.printf("%1.2f", saldo[z][h]);
				
				System.out.print("");
			}
		}
		
		//Pretendemos almacenar en la primera dimensión del array el valor fijo (en i=0, pondrá siempre el mismo valor.
		
		

}
}
