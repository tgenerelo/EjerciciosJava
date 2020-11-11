package Ejercicios1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_01 {

	public static void main(String[] args) {
		/*
		 * Crea un vector con un tamaño de 10, el algoritmo te solicitará por teclado 10
		 * números y terminará mostrando por pantalla la media de valores del vector.
		 */

		int tam = 10, vNums[] = new int[10], userInput = 0, suma = 0;
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();

		for (int i = 0; i < vNums.length; i++) {
			vNums[i] = 0;
		}

		for (int i = 0; i < vNums.length; i++) {
			System.out.print("Introduce un número: ");
			userInput = leer.nextInt();
			vNums[i] = userInput;
		}

		for (int i = 0; i < vNums.length; i++) {
			suma = suma + vNums[i];
		}

		System.out.println("\nLa media es " + ((float) suma / vNums.length));
	}

}
