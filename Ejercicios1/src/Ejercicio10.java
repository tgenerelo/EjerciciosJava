import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Modificar el algoritmo anterior, de forma que si se teclea un cero, se vuelva
		 * a pedir el número por teclado (así hasta que se teclee un número mayor que
		 * cero) (recuerda la estructura mientras).
		 */

		int num1 = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce un número:");
		num1 = leer.nextInt();

		while (num1 == 0) {
			System.out.println("El número no puede ser 0. Introduce otro número:");
			num1 = leer.nextInt();
		}

		if (num1 == 0) {
			System.out.println("El número no es par ni impar.");
		} else {
			if (Math.floorMod(num1, 2) == 0) {
				System.out.println("El número es par.");
			} else {
				System.out.println("El número es impar.");
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
