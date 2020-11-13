package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_01 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida su nombre al usuario y lo escriba al revés (de la
		 * última letra a la primera: a partir de "Nacho" escribiría "ohcaN").
		 */

		String nombre = "", nombreFinal = "";
		Scanner leer = new Scanner(System.in);

		System.out.print("Escribe tu nombre: ");
		nombre = leer.nextLine();
		
		for (int i = 0; i<nombre.length(); i++) {
			nombreFinal= (nombre.substring(i, i+1) + nombreFinal);
		}
		
		System.out.print(nombreFinal);
		
	}

}
