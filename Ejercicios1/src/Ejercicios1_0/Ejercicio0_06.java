package Ejercicios1_0;
import java.util.Scanner;

public class Ejercicio0_06 {

	public static void main(String[] args) {
		/* Realizar un algoritmo que lea un número por teclado.
		 * En caso de que ese número sea 0 o menor que 0, se saldrá del programa
		 * imprimiendo antes un mensaje de error.
		 * Si es mayor que 0, se deberá calcular su cuadrado y la raiz cuadrada del mismo,
		 * visualizando el numero que ha tecleado el usuario y su resultado
		 * (“Del numero X, su potencia es X y su raiz X” ).
		 * Para calcular la raiz cuadrada se puede usar
		 * la función interna RAIZ(X) o con una potencia de 0,5.
		 */
		
		int num1=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num1=leer.nextInt();
		
		if (num1>0) {
			System.out.println("Cuadrado de " + num1 + ": " + (num1*num1));
			System.out.println("Raíz cuadrada de " + num1 + ": " + Math.sqrt(num1));
		} else {
			System.out.println("Error. El programa se cerrará.");
		}
		
	}

}
