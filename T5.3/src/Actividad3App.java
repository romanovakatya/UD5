import javax.swing.JOptionPane;

public class Actividad3App {

	public static void main(String[] args) {
		
		// declaración de las variables,
		String name  = JOptionPane.showInputDialog("Introduce su nombre");
		
		//muestra un mensaje de bienvenida,
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);

	}

}
