package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_03 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida su nombre al usuario y diga cuántas vocales
		 * contiene (por ejemplo, "Aurora" tiene 4 vocales).
		 */

		String nombre = "Aurora";
		String vocales = "aáàeéèiíìoóòuúù";
		Scanner leer = new Scanner(System.in);
		int contador = 0;

		System.out.print("Escribe tu nombre: ");
		nombre = leer.nextLine();

		System.out.println(nombre.substring(3, 3));

//		BUSCAR DEL PRINCIPIO AL FINAL
//		for (int i=0; i<vocales.length(); i++) {
//			for (int j=0; j<nombre.length(); j++) {
//				if (vocales.substring(i, i+1).equalsIgnoreCase(nombre.substring(j, j+1))==true) {
//					contador++;
//				}
//			}
//		}

//		BUSCAR DEL FINAL AL PRINCIPIO
		for (int i = vocales.length() - 1; i >= 0; i--) {
			for (int j = nombre.length() - 1; j >= 0; j--) {
				if (vocales.substring(i, i + 1).equalsIgnoreCase(nombre.substring(j, j + 1)) == true) {
					contador++;
				}
			}
		}

		System.out.println("Número de vocales: " + contador + ".");

	}

}
