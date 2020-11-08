import java.util.Scanner;

public class Ejercicio2_06 {

	public static void main(String[] args) {
		/*
		 * Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado
		 */

		int num=0, mult=3, contador=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num=leer.nextInt();
		System.out.println();
		
		for (int i=1; i<=num; i++) {
			
			if (Math.floorMod(i, 3)==0) {
				System.out.print(i);
				contador=contador+1;
				if (i<num) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
			
			
		}
		
		System.out.println();
		System.out.println("Nº de múltiplos: " + contador + ".");
		
	}

}
