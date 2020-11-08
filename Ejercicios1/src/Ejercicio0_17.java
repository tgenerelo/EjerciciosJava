import java.util.Scanner;

public class Ejercicio0_17 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo y la media de todos ellos.
		 * Piensa como debemos inicializar las variables.
		 */

		// VARIABLES
		int num=0, suma=0, min=0, max=0, contador;
		boolean salir=false;
		String userInput="";
		Scanner leer=new Scanner(System.in);
		
		do {
			
			// PEDIR PRIMER NÚMERO
			contador=0;
			System.out.println("Introduce un número:");
			num=leer.nextInt();
			suma=suma+num;
			min=num;
			max=num;
			contador=contador+1;
			
			// PEDIR DEMÁS NÚMEROS
			do {
				System.out.println("Introduce otro número. Para terminar, introduce 0:");
				num=leer.nextInt();
				if (num!=0) {
					contador=contador+1;
					suma=suma+num;
					if (num>max) {
						max=num;
					}
					if (num<min) {
						min=num;
					}
				}
				
			} while (num!=0);
			
			// RESULTADO
			System.out.println();
			System.out.println("El número mayor de los que has introducido es " + max + ".");
			System.out.println("El número menor de los que has introducido es " + min + ".");
			System.out.println("La media de los " + contador + " números introducidos es " + (suma/contador) + ".");
			
			System.out.println();
			System.out.println("Escribe cualquier palabra para volver a empezar, o SALIR para cerrar el programa:");
			System.out.println();
			userInput=leer.next();
			if (userInput.equalsIgnoreCase("salir")) {
				salir=true;
			} else {
				salir=false;
			}
			
		} while (salir==false);
		
		
		
		
	}

}
