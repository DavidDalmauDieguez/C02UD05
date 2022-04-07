import java.util.Scanner;

import javax.swing.JOptionPane;

// Escribe una aplicacion con un String que contenga una contraseña cualquiera. Despues se te pedira que introduzcas la contraseña, con 3 intentos. 
// Cuando aciertes ya no pedira mas la contraseña y mostrar un mensaje diciendo "Enhorabuena"
public class Ejercicio12 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
								
		// Creamos las variables 
		String contraseña;
		
		// Pedimos la contraseña
		contraseña=JOptionPane.showInputDialog("Introduce una contraseña: ");
		
		// Le ponemos 3 intentos para acertar
		for (int i = 0; i < 3; i++) {
			String pass=JOptionPane.showInputDialog("Introduce una contraseña: ");						
			// Si es diferente 
			if (pass != contraseña && i == 3) {
				JOptionPane.showMessageDialog(null, "Has superado el limite de intentos");				
			// Si la variable es la escrita al principio
			} else if (pass == contraseña){
				JOptionPane.showMessageDialog(null, "Enhorabuena");
			}
		}

	}

}
