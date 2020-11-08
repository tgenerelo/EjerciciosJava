
public class Ejercicio2_02 {

	public static void main(String[] args) {
		// Hacer un pseudocódigo que imprima los números del 100 al 0, en orden decreciente.

		int hasta=0;

		for (int i=100; i>=hasta; i--) {
			System.out.print(i);
			if (i>hasta) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}

	}

}
