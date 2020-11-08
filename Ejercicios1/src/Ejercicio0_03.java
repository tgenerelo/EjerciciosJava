import java.util.Scanner;

public class Ejercicio0_03 {

	public static void main(String[] args) {
		/*Algoritmo que lea dos números y nos diga cual de ellos
		 * es mayor o bien si son iguales (recuerda usar la estructuracondicional SI)
		 */
		
		int num1=0, num2=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num1=leer.nextInt();
		System.out.println("Introduce otro número: ");
		num2=leer.nextInt();
		
		if (num1>num2) {
			System.out.println("El número " + num1 + " es mayor que " + num2 + ".");
		}
		if (num2>num1) {
			System.out.println("El número " + num2 + " es mayor que " + num1 + ".");
		}
		if (num1==num2) {
			System.out.println("Los dos números son iguales.");
		}
	}

}
