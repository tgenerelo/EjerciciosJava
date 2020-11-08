import java.util.Scanner;

public class Ejercicio2_05 {

	public static void main(String[] args) {
		/*
		 * Hacer un pseudocódigo que solo nos permita introducir S o N.
		 */

		Scanner leer=new Scanner(System.in);
		String userInput="";
		
		do {
			System.out.print("Introduce una respuesta (S/N): ");
			userInput=leer.next();
			System.out.println();
			if (userInput.equalsIgnoreCase("s") || userInput.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("Respuesta errónea, vuelve a intentarlo.");
				System.out.println();
			}
		} while (!userInput.equalsIgnoreCase("s") || !userInput.equalsIgnoreCase("n"));
	
		System.out.println("Respuesta correcta.");
	}

}
