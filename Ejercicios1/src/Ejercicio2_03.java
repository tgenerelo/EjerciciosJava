
public class Ejercicio2_03 {

	public static void main(String[] args) {
		// Hacer un pseudocódigo que imprima los números pares entre 0 y 100.
		
		int hasta=100, inicio=0;
		
		if (Math.floorMod(inicio, 2)!=0) {
			inicio=inicio+1;
		}

		for (int i=inicio; i<=hasta; i=i+2) {
			System.out.print(i);
			if (i<hasta) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}

	}

}
