import java.util.Scanner;

public class Actividad10App {

	public static void main(String[] args) {

		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);

		int numVentas = 0;
		int sum = 0;

		// pedimos cantidad de ventas,
		System.out.println("Diga un número de ventas");
		numVentas = teclado.nextInt();

		// hasta que no sea el número de ventas indicadas,
		for (int i = 0; i < numVentas; i++) {

			// pedimos otro número de ventas
			System.out.println("Introduce un numero de ventas");
			int venta = Integer.parseInt(teclado.next());

			// calculamos la suma de todas las ventas,
			sum = sum + venta;
		}

		// mostramos suma,
		System.out.println("Suma de todas las ventas es: " + sum);
		teclado.close();
	}

}
