import java.util.Scanner;

public class Ejercicio0_04 {

	public static void main(String[] args) {
		/*Algoritmo que lea tres números distintos y nos diga cual de ellos es el mayor
		 * (recuerda usar la estructura condicional Si y los operadores lógicos).
		 */

		int num1=1, num2=2, num3=3;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num1=leer.nextInt();
		System.out.println("Introduce otro número:");
		num2=leer.nextInt();
		System.out.println("Introduce otro número:");
		num3=leer.nextInt();
		
		if ((num1>num2)&(num1>num3)) {
			System.out.println("El número " + num1 + " es el mayor.");
		}
		if ((num2>num1)&(num2>num3)) {
			System.out.println("El número " + num2 + " es el mayor.");
		}
		if ((num3>num1)&(num3>num2)) {
			System.out.println("El número " + num3 + " es el mayor.");
		}
		
	}

}
