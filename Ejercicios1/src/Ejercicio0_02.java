import java.util.Scanner;

public class Ejercicio0_02 {

	public static void main(String[] args) {
		/* Algoritmo que lea dos números, calculando y escribiendo
		 * el valor de su suma, resta, producto y división.
		 */

		float num1, num2;
		float division;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num1=leer.nextInt();
		System.out.println("Introduce otro número:");
		num2=leer.nextInt();
		
		division=(num1/num2);
		
		System.out.println("Resultado de sumar " + num1 + " y " + num2 + ": " + (num1+num2));
		System.out.println("Resultado de restar " + num1 + " y " + num2 + ": " + (num1-num2));
		System.out.println("Resultado de multiplicar " + num1 + " y " + num2 + ": " + (num1*num2));
		System.out.println("Resultado de dividir " + num1 + " y " + num2 + ": " + division);
	}

}
