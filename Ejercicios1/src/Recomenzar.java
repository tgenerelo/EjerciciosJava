import java.util.Scanner;

public class Recomenzar {

	public static void main(String[] args) {
		/*
		 * Enunciado aquí
		 */

		// VARIABLES
		boolean salir=false;
		String userInput="";
		Scanner leer=new Scanner(System.in);
		
		do { // Bucle para recomenzar el programa
			
			
			
			System.out.println();
			System.out.println("Escribe cualquier palabra para volver a empezar, o SALIR para cerrar el programa:");
			System.out.println();
			userInput=leer.next();
			if (userInput.equalsIgnoreCase("salir")) {
				salir=true;
			} else {
				salir=false;
			}
			
		} while (salir==false);

	}

}
