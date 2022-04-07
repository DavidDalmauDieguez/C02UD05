import java.util.Scanner;

// lee un numero por teclado que pida el precio de un producto (puede ser decimal) y 
// calcule el precio final con IVA. El IVA sera constante que sera 21%
public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
						
		// Creamos las variables
		double num;
		double precioFinal;
		final double iva = 0.21;
		
		// Preguntamos el valor
		System.out.println("Añade el precio del producto: ");
		num = sc.nextDouble();
		
		// Calculamos el precio con iva
		precioFinal = num * (1+ iva);
		
		System.out.println("El precio del producto es = " + precioFinal);

	}

}
