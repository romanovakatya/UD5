
public class Actividad9App {

	public static void main(String[] args) {

		// mostramos números divisibles entre 2 y 3,
		for (int i = 1; i < 101; i++) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}		
		}
	}
}
