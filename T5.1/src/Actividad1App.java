
public class Actividad1App {

	public static void main(String[] args) {

		// declaración de las variables,
		int number1 = -50;
		int number2 = 10;

		// comprobamos si números son iguales,
		if (number1 == number2) {
			
			System.out.println(number1 + " y " + number2 + " son iguales");
		} 
		else {
			if (number1 > number2) {
				System.out.println(number1 + " es mayor que " + number2);
			} else {
				System.out.println(number2 + " es mayor que " + number1);
			}
		}
	}
}
