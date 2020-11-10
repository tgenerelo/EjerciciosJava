package Ejercicios1_1;
import java.util.Scanner;

public class Ejercicio1_02 {

	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo que ayude a Cristian a cobrar a los clientes que compran en su tienda de informática.
		 * El algoritmo tiene que:
		 * Una vez introducido el importe de la compra, devolver cuanto paga el cliente de IVA.
		 * Cuanto es el importe total de la compra (tras sumarle el IVA).
		 * Leer con qué dinero paga el cliente y escribir cual es el cambio que tiene que devolverle Cristian.
		 */

		int iva=21;
		float precio=0, precioFinal=0, deuda=0, clienteEntrega=0;
		Scanner leer=new Scanner(System.in);

		System.out.print("Introduce el precio del artículo: ");
		precio=leer.nextInt();
		precioFinal=(precio+(precio*iva/100));

		System.out.println("Precio con IVA: " + precioFinal + " €");
		System.out.println();
		deuda=precioFinal;

		do {
			System.out.print("¿Cuánto entrega el cliente? ");
			clienteEntrega=leer.nextFloat();
			deuda=deuda-clienteEntrega;

			if (deuda>0) {
				System.out.println("Pendiente de pago: " + deuda + " €");
			}

		} while (deuda>0);

		System.out.println();

		if (deuda==0) {
			System.out.println("Importe exacto :)");
		} else {
			System.out.println("A devolver: " + (-deuda) + " €");
		}

		


	}

}
