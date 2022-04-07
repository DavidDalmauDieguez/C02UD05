import java.util.Scanner;

import javax.swing.JOptionPane;

// Modifica la aplicacion anterior, para que nos pida el nombre que queremos introducir
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		String nombre;
		
		// Creamos un POP UP para pedir el nombre
		nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		// Creamos un POP UP con el mensaje final
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

	}

}
