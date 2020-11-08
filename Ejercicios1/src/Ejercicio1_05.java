import java.util.Scanner;

public class Ejercicio1_05 {

	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo que muestre la tabla de multiplicar del número que se introduzca.
		 */

		int num=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num=leer.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
	}

}
