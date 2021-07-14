import java.util.Scanner;

public class Actividad6App {

	public static void main(String[] args) {
		
		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);
				
		final double IVA = 1.21;
		double price;
		
		//pedimos el precio,
		System.out.println("Diga el precio de un producto");
		
		price = Double.parseDouble(teclado.next());
		
		//mostramos precio final,
		System.out.println("Precio final del producto es: " +  (price * IVA));
		
		teclado.close();
	}

}
