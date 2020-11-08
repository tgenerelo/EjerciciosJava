import java.util.Scanner;

public class Ejercicio0_05 {

	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que pida por teclado tres números; si el primero es
		 * negativo, debe imprimir el producto de los tres y si no lo es, imprimirá la
		 * suma.
		 */
		int num1 = 1, num2 = 2, num3 = 3;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce un número:");
		num1 = leer.nextInt();
		System.out.println("Introduce otro número:");
		num2 = leer.nextInt();
		System.out.println("Introduce otro número:");
		num3 = leer.nextInt();

		if (num1 < 0) {
			System.out.println(num1 + " x " + num2 + " x " + num3 + " = " + (num1 * num2 * num3));
		} else {
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		}

	}

}
