import java.util.Scanner;

public class Actividad11App {

	public static void main(String[] args) {

		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);
		String day;

		// pedimos e¡un día de la semana,
		System.out.println("Diga un día de la semana");
		day = teclado.next().toLowerCase();

		switch (day) {
		case "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes":
			System.out.println("Es el día laboral");
			break;

		case "sábado", "sabado", "domingo":
			System.out.println("Es el día festivo");
			break;
		default:
			System.out.println("Datos introducidos no coinciden a ningún día de la semana");
			break;
		}
		teclado.close();
	}
}
