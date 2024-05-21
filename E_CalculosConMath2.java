package PrimerosPasos;

public class E_CalculosConMath2 {

	public static void main(String[] args) {
		
		double num1 = 5.87;
		
		int resultado1 = (int)Math.round(num1); //refundición, convertir un tipo de dato en otro.
		
		System.out.println("El redondeo es "+resultado1);
		
		
		double base=5;
		double exponente=3;
		
		double resultado2 = Math.pow(base, exponente);
		
		System.out.println("La potencia de los numeros es "+resultado2); //Concatenación.

	}

}
