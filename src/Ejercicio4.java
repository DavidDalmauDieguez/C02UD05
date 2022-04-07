import java.util.Scanner;

// Haz una aplicacion que calcule el area de un circulo (pi*R^2). 
// El radio se pedirá por teclado (recuerda pasar de String a double con double.parseDouble). Usa la constante PI y el meteodo pow de Math
public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		double area;
		String radio = null;
		
		// Pedimos el radio por consola
		System.out.println("Añade el tamaño del radio: ");
		radio = sc.next();
		
		// Pasamos el String a un numero Decimal
		double radioDouble = Double.parseDouble(radio);
		// Calculamos el area
		area = Math.PI * Math.pow(radioDouble, 2);
		
		// Imprimimos la respuesta
		System.out.println("El area del circulo es = " + area);
		
	}

}
