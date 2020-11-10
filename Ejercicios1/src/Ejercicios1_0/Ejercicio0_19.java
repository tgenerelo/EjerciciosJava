package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio0_19 {

	public static void main(String[] args) {
		/*
		 * Leer tres números que denoten una fecha (día, mes, año). Comprobar que es una fecha válida.
		 * Si no es válida escribir un mensaje de error.
		 * Si es válida escribir la fecha cambiando el número del mes por su nombre.
		 * Ej. si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe ser mayor que 0. (Recuerda la estructura segun sea).
		 */

		// VARIABLES
		boolean salir=false, fechaValida=false;
		int dia=0, mes=0, anio=0;
		String userInput="", mesL="";
		Scanner leer=new Scanner(System.in);

		do { // Bucle para recomenzar el programa



			do {
				// PEDIR DATOS
				System.out.print("Introduce el día: ");
				dia=leer.nextInt();
				System.out.print("Introduce el mes: ");
				mes=leer.nextInt();
				System.out.print("Introduce el año: ");
				anio=leer.nextInt();

				// COMPROBAR
				switch (mes) {
				case 1:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="enero";
					}
					break;
				case 2:
					if (dia>=1 & dia<=28) {
						fechaValida=true;
						mesL="febrero";
					}
					break;
				case 3:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="marzo";
					}
					break;
				case 4:
					if (dia>=1 & dia<=30) {
						fechaValida=true;
						mesL="abril";
					}
					break;
				case 5:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="mayo";
					}
					break;
				case 6:
					if (dia>=1 & dia<=30) {
						fechaValida=true;
						mesL="junio";
					}
					break;
				case 7:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="julio";
					}
					break;
				case 8:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="agosto";
					}
					break;
				case 9:
					if (dia>=1 & dia<=30) {
						fechaValida=true;
						mesL="septiembre";
					}
					break;
				case 10:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="octubre";
					}
					break;
				case 11:
					if (dia>=1 & dia<=30) {
						fechaValida=true;
						mesL="noviembre";
					}
					break;
				case 12:
					if (dia>=1 & dia<=31) {
						fechaValida=true;
						mesL="diciembre";
					}
					break;

				default:
					fechaValida=false;
					break;
				}

				if (fechaValida==false || anio==0) {
					System.out.println("La fecha introducida no es válida. Inténtalo de nuevo.");
					System.out.println();
				}

			} while (fechaValida==false);

			// RESULTADO
			System.out.println();
			System.out.print("La fecha introducida es el " + dia + " de " + mesL + " del ");

			if (anio>0) {
				System.out.print(anio + ".");
			}
			if (anio<0) {
				anio=-anio;
				System.out.print(anio + " a. C.");
			}


			System.out.println();
			System.out.println();
			System.out.println("Escribe cualquier palabra para volver a empezar, o SALIR para cerrar el programa:");
			System.out.println();
			userInput=leer.next();
			System.out.println();
			if (userInput.equalsIgnoreCase("salir")) {
				salir=true;
			} else {
				salir=false;
			}

		} while (salir==false);

	}

}
