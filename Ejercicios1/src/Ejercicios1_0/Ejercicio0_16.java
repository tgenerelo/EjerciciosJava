package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio0_16 {

	public static void main(String[] args) {
		/*
		 * Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que nos pida una clave.
		 * Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un mensaje
		 * indicándonos que hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor).
		 * Si acertamos la clave, saldremos directamente del programa.
		 */
		
		// VARIABLES
		String pass="eureka", userInput="";
		int contador=3;
		boolean exito=false;
		Scanner leer=new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce la contraseña:");
			userInput=leer.next();
			contador=contador-1;
			
			if (userInput.equals(pass)) {
				exito=true;
			} else {
				System.out.println("Contraseña errónea. Intentos restantes: " + contador);
				System.out.println();
				if (contador==0) {
					break;
				}
			}
			
		} while (exito==false);
		
		System.out.println();
		
		if (exito==true) {
			System.out.println("Contraseña correcta. Acceso concedido.");
		} else {
			System.out.println("Demasiados intentos erróneos. El programa se cerrará.");
		}

		
		
	}

}
