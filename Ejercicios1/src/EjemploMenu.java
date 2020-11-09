import java.util.Scanner;

public class EjemploMenu {

	public static int printMenu() {
		Scanner leer = new Scanner(System.in);
		int userInput = 0, primeraOpc = 1, ultimaOpc = 3;

		while (userInput < primeraOpc || userInput > ultimaOpc) {

			System.out.println("1 - Opción 1");
			System.out.println("2 - Opción 2");
			System.out.println("3 - Salir");
			System.out.println("------------");
			System.out.print("Escoge una opción: ");
			userInput = leer.nextInt();
			System.out.println();

			if (userInput < primeraOpc || userInput > ultimaOpc) {
				System.out.println("Opción inválida. Vuelve a intentarlo.");
				System.out.println();
			}

		}

		return userInput;

	}

	public static void main(String[] args) {
		int menuSelect = 0;
		
		do {
			menuSelect = printMenu();

			switch (menuSelect) {
			case 1:
				System.out.println("Se ejecuta la primera opción.");
				System.out.println();
				break;

			case 2:
				System.out.println("Se ejecuta la segunda opción.");
				System.out.println();
				break;

			case 3:
				System.out.println("El programa se cerrará.");
				break;
			}
		} while (menuSelect!=3);
		
	}

}
