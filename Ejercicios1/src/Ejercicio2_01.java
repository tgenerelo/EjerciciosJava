
public class Ejercicio2_01 {

	public static void main(String[] args) {
		/*
		 * Hacer un pseudocódigo que imprima los números del 1 al 100.
		 */

		int hasta=100;
		
		for (int i=1; i<=hasta; i++) {
			System.out.print(i);
			if (i<hasta) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		
	}

}
