import java.util.Scanner;

// Realiza una aplicacion que nos pida numero de ventas a introducir, despues nos pedira tantas ventas por teclado como numero de ventas se hayan indicado. 
// Alfinal mostrara la suma de todas las ventas
public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
						
		// Creamos las variables 
		int numVentas;
		int numSubVentas;
		
		// Pedimos el numero de ventas iniciales
		System.out.println("Cuantas ventas has hecho?");
		numVentas = sc.nextInt();
		
		// Mientras haya ventas preguntamos el numero de subventas
		for (int i = 0; i < numVentas; i++) {
			System.out.println("Cuantas subventas has hecho?");
			numSubVentas = sc.nextInt();
			
		}	

	}

}
