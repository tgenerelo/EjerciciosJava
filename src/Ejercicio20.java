import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*
		 *  Calcular las calificaciones de un grupo de alumnos.
		 *  La nota final de cada alumno se calcula según el siguiente criterio:
		 *  la parte práctica vale el 10%.
		 *  la parte de problemas vale el 50%.
		 *  la parte teórica el 40%.
		 *  El algoritmo leerá el nombre del alumno, las tres notas, escribirá el resultado y
		 *  volverá a pedir los datos del siguiente alumno hasta que el nombre sea una cadena vacía.
		 *  Las notas deben estar entre 0 y 10, si no lo están, no imprimirá las notas,
		 *  mostrara un mensaje de error y volverá a pedir otro alumno.
		 */

		// VARIABLES
		boolean salir=false, error=false;
		float notaPractica=0, notaProblemas=0, notaTeoria=0, notaFinal=0;
		String userInput="", nombre="";
		Scanner leer=new Scanner(System.in);

		// PORCENTAJES NOTAS
		int practicaPrct=10;
		int problemasPrct=50;
		int teoriaPrct=40;
		
		do { // Bucle para recomenzar el programa

			// PEDIR DATOS
			System.out.println("NUEVA CONSULTA");
			System.out.println("==============");
			System.out.print("Introduce el nombre del alumno: ");
			nombre=leer.next();
			
			do {
				System.out.print("Introduce la nota de la parte práctica (" + practicaPrct + "%): ");
				notaPractica=leer.nextFloat();
				System.out.print("Introduce la nota de la parte de problemas (" + problemasPrct + "%): ");
				notaProblemas=leer.nextFloat();
				System.out.print("Introduce la nota de la parte teórica (" + teoriaPrct + "%): ");
				notaTeoria=leer.nextFloat();
				
				if (!(notaPractica>0 & notaPractica<10) || !(notaProblemas>0 & notaProblemas<10) || !(notaTeoria>0 & notaTeoria<10)) {
					error=true;
					System.out.println();
					System.out.println("Alguna de las notas introducidas no es correcta. Por favor, vuelve a intentarlo:");
					System.out.println();
				} else {
					error=false;
				}
			} while (error==true);
			
			// RESULTADO
			notaFinal=(notaPractica*practicaPrct/100)+(notaTeoria*teoriaPrct/100)+(notaProblemas*problemasPrct/100);
			
			System.out.println();
			System.out.println("La nota final de " + nombre + " es " + notaFinal + ".");
			System.out.println();
			

		} while (salir==false);

	}

}

