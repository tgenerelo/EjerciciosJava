package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio3_03 {

	public static void rellenarVector(int vNums[], int multiplo) {
		int resultado = 0;

		for (int i = 0; i < vNums.length; i++) {
			vNums[i] = multiplo * (i + 1);
		}
	}

	public static void main(String[] args) {
		/*
		 * Crea un vector en el que le indiques el tamaño por teclado y crear una
		 * función que rellene el vector con los múltiplos de un número pedido por
		 * teclado.
		 */

		int tam = 0, multiplo = 0;
		Scanner leer = new Scanner(System.in);

		System.out.print("Tamaño del vector: ");
		tam = leer.nextInt();

		int vNums[] = new int[tam];

		System.out.print("Número del que calcular los múltiplos: ");
		multiplo = leer.nextInt();

		rellenarVector(vNums, multiplo);

		System.out.print("Los " + tam + " primeros múltiplos de " + multiplo + " son ");
		for (int i = 0; i < vNums.length; i++) {
			System.out.print(vNums[i]);
			if (i < (vNums.length - 1)) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}

	}

}
