import java.util.Scanner;

public class Ejercicio18Kacper {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		for (int i = 1; i < 100; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)){
			System.out.println(i);
			}
		}
	}

}
