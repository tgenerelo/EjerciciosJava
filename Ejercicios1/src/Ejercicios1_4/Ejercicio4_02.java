package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_02 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida su nombre al usuario y lo escriba alternando letras
		 * mayúsculas y minúsculas (por ejemplo, "nAcho" se mostraría como "NaChO"
		 */

		String nombre="";
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		nombre=leer.nextLine();
		
		for (int i=0; i<nombre.length(); i++) {
			if (Math.floorMod(i, 2)==0) {
				System.out.print(nombre.toUpperCase().substring(i, i+1));
			} else {
				System.out.print(nombre.toLowerCase().substring(i, i+1));
			}
			
		}
		
		
	}

}
