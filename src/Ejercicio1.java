// Declara 2 variables numericas (con el alor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo tambien.
public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos las variables
		int num1 = 25;
		int num2 = 4;
		
		// Si num1 es mas grande que num2 imprime
		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es más grande que " + num2);
		// Si no cualquier otra cosa imprime
		} else if (num1 == num2) {
			System.out.println("El numero " + num2 + " es igual que " + num1);
		}else {
			System.out.println("El numero " + num2 + " es más grande que " + num1);
		}

	}

}
