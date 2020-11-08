import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Se pide representar el algoritmo que nos calcule la suma de los N primeros
		 * números naturales. N se leerá por teclado (no tenemos porque llamar a la
		 * variable N, podemos llamarla como queramos).
		 */
		
		int num = 0, suma = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		num = leer.nextInt();

		for (int i = 1; i <= num; i++) {
			suma = suma + i;
		}

		System.out.println("La suma de los " + num + " primeros números naturales es " + suma + ".");

	}
}
