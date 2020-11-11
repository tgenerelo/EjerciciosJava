package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio3_05 {

	public static void rellenarMatriz(String mContactos[][]) {
		for (int i = 0; i < mContactos.length; i++) {
			for (int j = 0; j < 2; j++) {
				mContactos[i][j] = "";
			}
		}
	}

	public static void mostrarMatriz(String mContactos[][]) {
		for (int i = 0; i < mContactos.length; i++) {
			System.out.println(mContactos[i][0] + ", " + mContactos[i][1] + " años.");
		}
	}

	public static void main(String[] args) {
		/*
		 * Haz lo mismo que el ejercicio anterior pero con una Matriz. Ten en cuenta que
		 * no podemos tener una columna con cadena y otra con números, así que usa la
		 * función convertiratexto(numero)para las celdas de las edades. Piensa cuantas
		 * columnas y filas deberá tener la matriz, también de qué forma deberemos
		 * recorrerla según lo que nos pide.
		 */

		String mContactos[][];
		int tam = 0;
		Scanner leer = new Scanner(System.in);

		System.out.print("¿Cuántos contactos quieres guardar? ");
		tam = leer.nextInt();
		System.out.println();

		mContactos = new String[tam][2];

		rellenarMatriz(mContactos);

		for (int i = 0; i < (tam); i++) {
			System.out.print("Escribe el nombre del contacto " + (i + 1) + ": ");
			mContactos[i][0] = leer.next();
			System.out.print("Escribe la edad del contacto " + (i + 1) + ": ");
			mContactos[i][1] = leer.next();
			System.out.println();
		}

		mostrarMatriz(mContactos);

	}

}
