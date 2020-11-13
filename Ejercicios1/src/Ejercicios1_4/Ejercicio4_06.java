package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_06 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario su nombre y apellidos y los muestre con
		 * las mayúsculas y minúsculas correctas (aparecerán en mayúsculas la primera
		 * letra y la que haya tras cada espacio; las demás aparecerán en minúsculas.
		 * Por ejemplo, si introduce "nAcho cabaNes", es escribirá "Nacho Cabanes").
		 */

		Scanner leer = new Scanner(System.in);
		String nombre = "nOmbrE apELLido", nombreFinal = "";

//		System.out.print("Escribe tu nombre: ");
//		nombre = leer.nextLine();

		nombre = " " + nombre;

		for (int i = 0; i < nombre.length(); i++) {
			if (i == nombre.length() - 1 || nombre.substring(i, i + 1).equals(" ") == true
					& nombre.substring(i + 1, i + 2).equals(" ") == false) {
				nombreFinal = nombreFinal + nombre.toUpperCase().substring(i, i + 1);
			} else {
				nombreFinal = nombreFinal + nombre.toLowerCase().substring(i, i + 1);
			}
		}

		System.out.println(nombreFinal);
	}

}
