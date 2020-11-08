import java.util.Scanner;

public class Ejercicio1_04 {

	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo para saber si el número introducido es par o impar.
		 */

		int num=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num=leer.nextInt();
		
		if (Math.floorMod(num, 2)==0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar.");
		}
		
	}

}
