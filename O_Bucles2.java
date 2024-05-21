import java.util.Scanner;

public class O_Bucles2 {

	public static void main(String[] args) {
		
		/*En esta ocasión queremos que el programa genere un número y que mediante pistas, podamos descubrir de qué número se trata.
		 *Para ello, necesitamos el método random(). Lo que hace es generar números aleatorios. Mediante el bucle while vamos a ir
		 *dando pistas para encontrar dicho número.
		 */
		
		int aleatorio=(int)(Math.random()*100);
		
		try (Scanner entrada = new Scanner(System.in)) {
			int numero = 0;
			int intentos = 0;
			
			while (numero!=aleatorio) {
				
				intentos++;
				
				System.out.println("Introduce un numero, por favor");
				
				numero = entrada.nextInt();
				
				if(aleatorio<numero) {
					
					System.out.println("Más bajo.");
					
				}
				
				else if(aleatorio>numero) {
					
					System.out.println("Más alto.");
				
			    }
				
            }
			
			System.out.println("¡Correcto! Lo has conseguido en "+ intentos + " intentos.");
		}
}

}
