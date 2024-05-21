package PrimerosPasos;

public class F_String {

	/**/

	public static void main(String[] args) {
		
		String nombre="Alvaro Granados Ruiz";
		int ultimaletra = nombre.length();
		
		System.out.println("Mi nombre es "+nombre);
		
		System.out.println("Mi nombre tiene "+nombre.length()+" letras");
		
		System.out.println("La primera letra de mi nombre es "+nombre.charAt(0));

		System.out.println("La ultima letra de mi nombre es "+ nombre.charAt(ultimaletra-1));
		
	}

}
