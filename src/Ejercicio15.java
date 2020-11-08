import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Dada una secuencia de números leídos por teclado, que acabe con un –1, por ejemplo: 
		 * 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el algoritmo que calcule la media aritmética.
		 * Suponemos que el usuario no insertara numero negativos.
		 */

		int num=0, suma=0, contador=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=leer.nextInt();
		suma=(suma+num);
		contador=(contador+1);
		
		do {
			System.out.println("Introduce otro número. Para terminar, introduce -1:");
			num=leer.nextInt();
			
			if (num==-1) {
				break;
			} else {
				suma=(suma+num);
				contador=(contador+1);
			}
		} while (num!=-1);
		
		System.out.println("La media aritmética de los números introducidos es " + (suma/contador) + ".");
		
	}

}
