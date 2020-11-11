package Ejercicios1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_06 {

	public static void rellenarMatriz(int mNums[][]) {
		Random azar = new Random();

		for (int i = 0; i < mNums.length; i++) {
			for (int j = 0; j < mNums[i].length; j++) {
				mNums[i][j] = azar.nextInt(99);
			}
		}
	}

	public static void mostrarMatriz(int mNums[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((mNums[i][j]) < 10) {
					System.out.print(" " + mNums[i][j]);
				} else {
					System.out.print(mNums[i][j]);
				}
				if (j == m - 1) {
					System.out.print("");
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		 * Crea una matriz de n x m donde n y m los leerás por teclado. Crea un
		 * procedimiento (subproceso) que te rellene la matriz con números aleatorios
		 * (recuerda la función azar(X)). Crea otro procedimiento (subproceso) que se
		 * encargue de mostrar por pantalla la matriz, pero cada fila de la matriz la
		 * pintara en la misma línea.
		 */

		int mNums[][], n = 0, m = 0;
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();

		System.out.print("Número de filas de la matriz: ");
		n = leer.nextInt();
		System.out.print("Número de columnas de la matriz: ");
		m = leer.nextInt();

		mNums = new int[n][m];

		rellenarMatriz(mNums);

		mostrarMatriz(mNums, n, m);

	}

}
