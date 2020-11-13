package Ejercicios1_4;

import java.util.Scanner;

public class Ejercicio4_04 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida su nombre al usuario y diga qué vocales contiene
		 * (en orden y sin repetir: por ejemplo, para "Aurora" deberá responder "aou").
		 */

		String vocales="aáàeéèiíìoóòuúù";
		String nombre="", nombreFinal="";
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		nombre=leer.nextLine();
		
		for (int i=0; i<vocales.length(); i++) {
			for (int j=0; j<nombre.length(); j++) {
				if (vocales.substring(i, i+1).equalsIgnoreCase(nombre.substring(j, j+1)) == true) {
					nombreFinal=nombreFinal+vocales.substring(i, i+1);
					break;
				}
			}
		}
		
		System.out.println("Vocales presentes en el nombre : " + nombreFinal + ".");
		
		
	}

}
