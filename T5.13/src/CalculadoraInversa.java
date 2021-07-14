import java.util.Scanner;

public class CalculadoraInversa {

	public static void main(String[] args) {

		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);
		int operand1;
		int operand2;
		String signoAritmetico;
		double resultado = 0;
		int result = 0;
		String[] menuSignosAritmeticos = { "\nElige signo aritmético:", "1 : + suma los dos operandos.",
				"2 : - resta los operandos.", "3 : * multiplica los operandos.", "4 : / divide los operandos",
				"5 : ^ 1º operando como base y 2º como exponente",
				"6 : %: módulo, resto de la división entre operando1 y operando2" };

		// pedimos operand 1,
		System.out.println("Escribe número 1");
		operand1 = teclado.nextInt();

		// pedimos operand 2,
		System.out.println("Escribe número 2");
		operand2 = teclado.nextInt();

		// pedimos eligir un signo,
		for (int i = 0; i < menuSignosAritmeticos.length; i++) {
			System.out.println(menuSignosAritmeticos[i]);
		}

		signoAritmetico = teclado.next();

		// switch de signo aritmetico,
		// según el signo elegido realizamos,
		// operación aritmética,

		switch (signoAritmetico) {
		case "1":
			result = operand1 + operand2;

			break;

		case "2":
			result = operand1 - operand2;

			break;

		case "3":
			result = operand1 * operand2;

			break;

		case "4":
			resultado = operand1 / operand2;

			break;

		case "5":
			resultado = Math.pow(operand1, operand2);

			break;

		case "6":
			resultado = operand1 % operand2;

			break;

		default:
			break;
		}

		//mostramos el resultado según la operación realizada,
		if (signoAritmetico.equalsIgnoreCase("1") || signoAritmetico.equalsIgnoreCase("2")
				|| signoAritmetico.equalsIgnoreCase("3")) {

			System.out.println("El resultado es: " + result);
		} 
		else {
			
			System.out.println("El resultado es: " + resultado);
		}

		teclado.close();
	}
}
