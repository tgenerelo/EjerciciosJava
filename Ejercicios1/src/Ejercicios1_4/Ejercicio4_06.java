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
		String nombre = "", nombre2 = "", nombreFinal = "";

		System.out.print("Escribe tu nombre: ");
		nombre = leer.nextLine();

		// AÑADIR ESPACIO AL FINAL
		 nombre = nombre + " ";
		
		// ELIMINAR ESPACIOS REPETIDOS
		for (int i = 0; i < nombre.length(); i++) {
			if (i < nombre.length() - 1
					&& nombre.substring(i, i + 1).equals(" ") & nombre.substring(i + 1, i + 2).equals(" ")) {

			} else {
				nombre2 = nombre2 + nombre.substring(i, i + 1);
			}
		}

		for (int i = 0; i < nombre2.length(); i++) {
			if (i == nombre2.length() - 1) {
				break; // SI LAS SIGUIENTES CONDICIONES VAN A PROVOCAR UN OUT OF BOUNDS, HACER UN BREAK
			}
			if (((nombre2.substring(i, i + 1).equals(" ")) & (nombre2.substring(i + 1, i + 2).equals(" ") == false))) {
				if (i > 0 & nombre2.substring(i, i + 1).equals(" ")) {
					nombreFinal = nombreFinal + " ";
				}
				i++;
				nombreFinal = nombreFinal + nombre2.toUpperCase().substring(i, i + 1);

			} else {
				nombreFinal = nombreFinal + nombre2.toLowerCase().substring(i, i + 1);
			}

		}

		System.out.println("Tu nombre correctamente escrito es: " + nombreFinal);
	}

}
