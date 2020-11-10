package Ejercicios1_1;
import java.util.Scanner;

public class Ejercicio1_03 {

	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo que nos indique si un triángulo es equilátero, isósceles o escaleno
		 */
		
		float ang1, ang2, ang3;
		Scanner leer=new Scanner(System.in);
		
		do {
			System.out.print("Introduce el primer ángulo: ");
			ang1=leer.nextFloat();
			System.out.print("Introduce el segundo ángulo: ");
			ang2=leer.nextFloat();
			System.out.print("Introduce el tercer ángulo: ");
			ang3=leer.nextFloat();
			
			System.out.println();
			
			if (ang1+ang2+ang3!=180) {
				System.out.println("No parece un triángulo. Inténtalo de nuevo.");
				System.out.println();
			}
			
		} while (ang1+ang2+ang3!=180);
		
		if (ang1==ang2 & ang1==ang3) {
			System.out.println("El triángulo es equilátero.");
		} else {
			if ((ang1==ang2 & ang1!=ang3) || (ang2==ang3 & ang2!=ang1) || (ang1==ang3 & ang1!=ang2)) {
				System.out.println("El triángulo es isósceles.");
			} else {
				if (ang1!=ang2 & ang1!=ang3) {
					System.out.println("El triángulo es escaleno.");
				}
			}
		}
		
		
		
		
		
		
		
		

	}

}
