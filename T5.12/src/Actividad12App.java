import java.util.Scanner;

public class Actividad12App {

	public static void main(String[] args) {

		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);
		String password = "1234";
		int intentos = 3;
		String passwordUser;

		//preguntamos la contraseña,
		//mientras quedan intentos y no se ha acertado,
		do {
			System.out.println("Introduzca la contraseña");
			passwordUser = teclado.next();
			intentos--;
		} while ((intentos > 0) && (!password.equalsIgnoreCase(passwordUser)));

		//mostramos un mensaje según resultado obtenido,
		if (intentos == 0) {
			System.out.println("No quedan intentos");
		} else {
			System.out.println("Enhorabuena");
		}

		teclado.close();
	}

}
