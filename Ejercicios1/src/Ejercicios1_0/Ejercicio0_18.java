package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio0_18 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que visualice la cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
		 */

		// VARIABLES
		boolean salir=false;
		String userInput="";
		Scanner leer=new Scanner(System.in);
		int num=0, limite=100;
		
		do { // Bucle para recomenzar el programa
			
			for (int i = 0; i<limite; i++) {
				if ((Math.floorMod(i+1, 2)==0) || (Math.floorMod(i+1, 3)==0)) {
					System.out.print(i+1);
					if (i<limite-1) {
						System.out.print(", ");
					}
					else {
						System.out.print(".");
					}
				}
			}
			
			System.out.println();
			
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
