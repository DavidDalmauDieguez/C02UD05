import javax.swing.JOptionPane;

// Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables
		String nombre = "David";
		
		// Creamos un POP UP con el mensaje
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
