package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_01 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida su nombre al usuario y lo escriba al revés (de la
		 * última letra a la primera: a partir de "Nacho" escribiría "ohcaN").
		 */

		String nombre = "";
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		nombre=leer.next();
		
		for (int i=(nombre.length()); i>0; i--) {
			System.out.print(nombre.substring(i, i));
		}
		
	}

}
