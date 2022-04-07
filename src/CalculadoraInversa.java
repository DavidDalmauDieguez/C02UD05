import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicacion llamada CalculadoraInversa, nos pedira 2 operandos (int) y un signo aritmetico (String), 
// segun este ultimo se realizara la operacion correspondiente. Al final mostrar la respuesta en un cuadro de dialogo
public class CalculadoraInversa {

	public static void main(String[] args) {
				// Creamos el Scanner
				Scanner sc = new Scanner(System.in);
										
				// Creamos las variables
				String num = null;
				String num2 = null;
				String signo;
				
				// Pedimos las variables
				num = JOptionPane.showInputDialog("Introduce un numero: ");
				num2 = JOptionPane.showInputDialog("Introduce un numero: ");
				signo = JOptionPane.showInputDialog("Introduce una operacion (+, -, *, /, ^, %): ");
				
				// transformamos los stirng a floats para que sean numericos
				float numDecimal = Float.parseFloat(num);
				float num2Decimal = Float.parseFloat(num2);
				double respuesta;			
				
				// Si la variable signo no es ninguna de las espicificadas
				if (signo != "+" || signo != "-" || signo != "*" || signo != "/" || signo != "^" || signo != "%") {	
					// Si es la espicificada calculamos
					switch (signo) {
					case "+":
						respuesta = numDecimal + num2Decimal;
						JOptionPane.showMessageDialog(null, num + " + " + num2 + " = " + respuesta);
						
						break;
					case "-":
						respuesta = numDecimal - num2Decimal;
						JOptionPane.showMessageDialog(null, num + " - " + num2 + " = " + respuesta);
						break;
					case "*":
						respuesta = numDecimal * num2Decimal;
						JOptionPane.showMessageDialog(null, num + " * " + num2 + " = " + respuesta);
						break;
					case "/":
						respuesta = numDecimal / num2Decimal;
						JOptionPane.showMessageDialog(null, num + " / " + num2 + " = " + respuesta);
						break;
					case "^":
						for (int i = 0; i < 1; i++) {
							respuesta = numDecimal * num2Decimal;
							JOptionPane.showMessageDialog(null, num + "^" + num2 + " = " + respuesta);
						}						
						break;
					case "%":
						respuesta = numDecimal % num2Decimal;
						JOptionPane.showMessageDialog(null, num + " % " + num2 + " = " + respuesta);
						break;
					// Si no es espicificada muestra
					default:
						JOptionPane.showMessageDialog(null, "Por favor solo se permite (+, -, *, /, ^, %) como operadores");
						break;
					}
				}
								
				

	}

}
