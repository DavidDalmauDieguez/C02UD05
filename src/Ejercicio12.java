import java.util.Scanner;

import javax.swing.JOptionPane;

// Escribe una aplicacion con un String que contenga una contrase�a cualquiera. Despues se te pedira que introduzcas la contrase�a, con 3 intentos. 
// Cuando aciertes ya no pedira mas la contrase�a y mostrar un mensaje diciendo "Enhorabuena"
public class Ejercicio12 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
								
		// Creamos las variables 
		String contrase�a;
		
		// Pedimos la contrase�a
		contrase�a=JOptionPane.showInputDialog("Introduce una contrase�a: ");
		
		// Le ponemos 3 intentos para acertar
		for (int i = 0; i < 3; i++) {
			String pass=JOptionPane.showInputDialog("Introduce una contrase�a: ");						
			// Si es diferente 
			if (pass != contrase�a && i == 3) {
				JOptionPane.showMessageDialog(null, "Has superado el limite de intentos");				
			// Si la variable es la escrita al principio
			} else if (pass == contrase�a){
				JOptionPane.showMessageDialog(null, "Enhorabuena");
			}
		}

	}

}
