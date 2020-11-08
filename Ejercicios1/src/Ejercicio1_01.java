import java.util.Scanner;

public class Ejercicio1_01 {

	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo para que insertados los salarios de un número indeterminado de
		 * empleados, el algoritmo nos calcule cuántos de ellos ganan más de 200€ y cuantos ganan más de 500€.
		 * Datos de entrada: Número de empleados, salario de cada uno de ellos.
		 * Datos de salida: Número de empleados que ganan más de 200€ y cuantos ganan más de 500€
		 */
		
		int userInput=0, numEmp=0, empMas500=0, emp201a500=0, empMen201=0;
		boolean salir=false;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Introduce el número de empleados: ");
		numEmp=leer.nextInt();
		System.out.println();
		for (int i = 1; i <= numEmp; i++) {
			System.out.print("Introduce el sueldo del empleado nº " + i + ":");
			userInput=leer.nextInt();
			if (userInput<=200) {
				empMen201=empMen201+1;
			}
			if (userInput>200 & userInput<=500) {
				emp201a500=emp201a500+1;
			}
			if (userInput>500) {
				empMas500=empMas500+1;
			}
		}
		
		System.out.println();
		
		System.out.println("Empleados que cobran 200 € o menos: " + empMen201);
		System.out.println("Empleados que cobran más de 200 € pero menos de 500 €: " + emp201a500);
		System.out.println("Empleados que cobran más de 500 €: " + empMas500);
		
		System.out.println();

	}

}
