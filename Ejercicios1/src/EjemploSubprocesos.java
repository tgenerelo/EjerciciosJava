
public class EjemploSubprocesos {

	public static int sumaParImpar(int inicio, int fin) {

		int sumaPares=0, sumaImpares=0;

		for (int i=inicio; i<=fin; i++) {
			System.out.print(i);
			if (i<fin) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}

		for (int i=inicio; i<=fin; i++) {
			if (Math.floorMod(i, 2)==0) {
				sumaPares=sumaPares+i;
			} else {
				sumaImpares=sumaImpares+i;
			}
		}

		return sumaPares;
	}


	public static void main(String[] args) {
		/*
		 * Hacer un pseudocódigo que imprima los números del 1 al 100.
		 * Que calcule la suma de todos los números pares por un lado, y por otro, la de todos los impares.
		 */

		sumaParImpar(1,100);

}

}
