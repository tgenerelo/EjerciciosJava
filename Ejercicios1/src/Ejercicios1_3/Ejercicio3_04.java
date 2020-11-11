package Ejercicios1_3;

import java.util.Scanner;

public class Ejercicio3_04 {

	public static void mostrarVectores(String vNombre[], int vEdad[]) {
		for (int i = 0; i < vNombre.length; i++) {
			System.out.println(vNombre[i] + ", " + vEdad[i] + " años.");
		}
	}

	public static void main(String[] args) {
		/*
		 * Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno
		 * de ellos almacenaras nombres de personas como cadenas, en el otro vector ira
		 * almacenando la edad de los nombres. Crea un procedimiento (subproceso) que
		 * muestre por pantalla el contenido de los dos vectores.
		 */

		String vNombre[];
		int vEdad[], tam = 0;
		Scanner leer = new Scanner(System.in);

		System.out.print("¿Qué tamaño tendrá el vector? ");
		tam = leer.nextInt();

		vEdad = new int[tam];
		vNombre = new String[tam];

		for (int i = 0; i < vNombre.length; i++) {
			System.out.print("Introduce el nombre del contacto " + (i + 1) + ": ");
			vNombre[i] = leer.next();
			System.out.print("Introduce la edad del contacto " + (i + 1) + ": ");
			vEdad[i] = leer.nextInt();
		}

		System.out.println();
		mostrarVectores(vNombre, vEdad);

	}

}
