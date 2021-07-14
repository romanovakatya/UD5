import java.util.Scanner;

public class Actividad5App {

	public static void main(String[] args) {
		
		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int number = Integer.parseInt(teclado.nextLine());
		
		System.out.println(number % 2);
		if ((number % 2) == 0) {
			
			System.out.println(number + " es par");
		}
		else {
			System.out.println(number + " es impar");
		}
		
		teclado.close();
	}

}
