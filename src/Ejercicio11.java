import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicacion que nos pida un dia de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello
public class Ejercicio11 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
				
		// Creamos las variables
		String dia;
				
		// Creamos un POP UP para pedir el nombre
		dia = JOptionPane.showInputDialog("Introduce un dia: ");
		
		// Si la variable dia es una de las espicificadas muestra
		switch (dia) {
		case "LUNES":		
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
		case "VIERNES":
			JOptionPane.showMessageDialog(null, dia + " es dia laborable");
			break;
		// Si la variable dia es una de las espicificadas muestra
		case "SABADO":
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, dia + " es dia no laborable");
			break;
			
		default:
		// Si la variable dia no es una de las espicificadas muestra
			JOptionPane.showMessageDialog(null, "El dia que has añadido no existe o (prueba la primera letra en mayus)");
			break;
		}
		
		
	}
}