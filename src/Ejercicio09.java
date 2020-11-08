import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Realizar un algoritmo que dado un número entero, visualice en pantalla si es
		 * par o impar. En el caso de ser 0, debe visualizar “el número no es par ni
		 * impar” (para que un numero sea par, se debe dividir entre dos y que su resto
		 * sea 0).
		 */

		int num1 = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce un número:");
		num1 = leer.nextInt();

		if (num1 == 0) {
			System.out.println("El número no es par ni impar.");
		} else {
			if (Math.floorMod(num1, 2) == 0) {
				System.out.println("El número es par.");
			} else {
				System.out.println("El número es impar.");
			}
		}

	}

}
