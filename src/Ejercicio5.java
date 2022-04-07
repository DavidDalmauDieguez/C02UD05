import java.util.Scanner;

// Lee un numero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambien debemos indicarlo
public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
				
		// Creamos las variables
		int num;
		int resto;
				
		// Pedimos el radio por consola
		System.out.println("Añade el tamaño del radio: ");
		num = sc.nextInt();
				
		// Calculamos el resto
		resto = num % 2;
				// Si el resto es 0 imprime
		if (resto == 0) {
			System.out.println("El numero es divisible entre 2");
		} else {
			System.out.println("El numero no es divisible entre 2");
		}
	}

}
