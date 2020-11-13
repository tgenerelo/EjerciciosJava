package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_05 {

	public static void main(String[] args) {
		/*
		 * Crea un programa quepida una frase al usuario y diga cuántas palabras
		 * contiene (pista: puedes contar los espacios, prestando atención en que no
		 * estén repetidos).
		 */

		Scanner leer = new Scanner(System.in);
		String frase = "";
		int contador = 0;

		System.out.println("Escribe una frase:");
		frase = leer.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (i + 1 == frase.length() || ((frase.substring(i, i + 1).equals(" "))
					& (frase.substring(i + 1, i + 2).equals(" ") == false))) {
				contador++;
			}
		}

		System.out.println("La frase tiene " + contador + " palabras.");

	}

}
