import java.util.Scanner;

import javax.swing.JOptionPane;

public class Actividad4App {

	public static void main(String[] args) {
		
		// declaración de las variables,
		Scanner teclado = new Scanner(System.in);				
		
		final double PI = Math.PI;
		
		System.out.println("Introduce el radio de circulo");		
		String textRadio = teclado.next();
		
		double radio = Double.parseDouble(textRadio);

		//calculamos area del circulo,
		double area = PI * (Math.pow(radio, 2));
		
		//mostramos el resultado,
		System.out.println("Area de circulo " + area);
		
		JOptionPane.showMessageDialog(null, "Area de circulo " + area);
		
		teclado.close();
	}

}
