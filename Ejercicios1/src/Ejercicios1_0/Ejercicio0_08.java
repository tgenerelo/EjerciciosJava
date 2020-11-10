package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio0_08 {

	public static void main(String[] args) {
		/*
		 * Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre.
		 * Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.
		 */
		
		
		// VARIABLES
		int descuento=15, importe=0;
		boolean descApl=false, salir=false;
		String mes="octubre", userInput="", mesAbr=mes.substring(0, 3);
		Scanner leer=new Scanner(System.in);

		do {
			// PEDIR MES Y COMPARARLO
			System.out.println("Escribe el mes:");
			userInput=leer.next();
			if (userInput.equalsIgnoreCase(mes) || userInput.equalsIgnoreCase(mesAbr)) {
				descApl=true;
			} else {
				descApl=false;
			}
			
			System.out.println();
			
			// PEDIR IMPORTE
			System.out.println("Escribe el importe del artículo:");
			importe=leer.nextInt();
			
			System.out.println();
			
			// MOSTRAR RESULTADO
			if (descApl==true) {
				System.out.println("Existe un descuento en el mes introducido, por lo que tu artículo tiene un precio especial de " + (importe-(importe*descuento/100)) + " €.");
				
			} else {
				System.out.println("No existe ningún descuento en el mes introducido, por lo que tu artículo tiene un precio de " + importe + " €.");
			}
			
			System.out.println();
			
		} while (salir==false);

		
	}

}
