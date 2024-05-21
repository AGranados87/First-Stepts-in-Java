package PrimerosPasos;

public class G_String2 {

	public static void main(String[] args) {
		
		String coco="Coquete es un perrete guapete";
		
		//El método substring sirve para crear otro String con un fragmento de la primera frase.
		
		String coco2=coco.substring(0, 4); //primer numero: caracter donde empieza.
		String coco3=coco.substring(0, 10); // Ultimo numero: caracter donde acaba.
		
		System.out.println(coco2);
		System.out.println(coco3);
		System.out.println(coco);
		
	}

}
