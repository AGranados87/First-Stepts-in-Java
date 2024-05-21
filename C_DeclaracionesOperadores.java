package PrimerosPasos;

public class C_DeclaracionesOperadores {

	public static void main(String[] args) {
		
		int a=05; //Declaración e iniciación de variable
		int b; //Declaración variable
		
		b=7; //Iniciación de variable
		
		int c=b+a;
		
		System.out.println("Suma de variables = "+c);
		
		
		final int h=5; //Constante
		
		
		System.out.println("La constante es "+h);

		final double apulgadas = 2.54;
		
		double cm = 9;
		
		double resultado = cm/apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");

		int operador1, operador2, operador3;
		
		operador1=1;
		operador2=2;
		operador3=3;
		
		resultado= operador1+operador2+operador3;
		
		System.out.println("El resultado es "+resultado);
		
	}

}



