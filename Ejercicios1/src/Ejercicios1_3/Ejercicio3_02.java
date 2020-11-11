package Ejercicios1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_02 {

	public static float calcularMedia(int vNums[], int tam) {
		int suma = 0;

		for (int i = 0; i < vNums.length; i++) {
			suma = suma + vNums[i];
		}

		return (suma / vNums.length);
	}

	public static void main(String[] args) {
		/*
		 * Realiza el problema anterior creando una función (subproceso)
		 * “calcular_media” la cual reciba como parámetros un vector, el tamaño del
		 * mismo y devuelve la media de los valores del vector
		 */

		int tam = 3, userInput = 0;
		int vNums[] = new int[tam];
		float resultado = 0;
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

		resultado = calcularMedia(vNums, tam);

		System.out.println("\nLa media es " + resultado);

	}

}
