import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay
		 * en el curso actual. Diseñar un algoritmo para este propósito (recuerda que
		 * para calcular el porcentaje puedes hacer una regla de 3).
		 */

		int chicos = 0, chicas = 0, total = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce el número de niños:");
		chicos = leer.nextInt();
		System.out.println("Introduce el número de niñas:");
		chicas = leer.nextInt();

		total = (chicos + chicas);

		System.out.println();
		System.out.println("Niños: " + (chicos * 100 / total) + "%.");
		System.out.println("Niñas: " + (chicas * 100 / total) + "%.");
	}

}
