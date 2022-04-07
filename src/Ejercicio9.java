
public class Ejercicio9 {

	public static void main(String[] args) {
		// Creamos las variables
		int num;
				
		// Mientras el numero este dentro de 1 y 100 se repite
		for (num = 1; num < 101; num++) {
			// Si el resto del numero dividido entre 2 o 3 es igual a 0
			if (num%2 == 0 || num%3 == 0) {
				// Imprimimos
				System.out.println(num);
			}
			
		}

	}

}
