package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		char operador;
		int num1;
		int num2;
		boolean flag = true;
		final char SUMA = '+';
		final char RESTA = '-';
		final char MULT = '*';
		final char DIV = '/';
		final char FIN = 'F';
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la operación a realizar (" + SUMA + "; " + RESTA + "; " + MULT + "; " + DIV + ") o ingrese '" + FIN + "' para salir: ");
			operador = input.nextLine().toUpperCase().charAt(0);
			
			if (operador != FIN) {
				System.out.println("Ingrese el primer entero: ");
				num1 = Integer.parseInt(input.nextLine());
				
				System.out.println("Ingrese el segundo entero: ");
				num2 = Integer.parseInt(input.nextLine());
				
				
				switch(operador) {
				case '+':
					System.out.println(num1 + num2);
					break;
				case '-':
					System.out.println(num1 - num2);
					break;
				case '*':
					System.out.println(num1 * num2);
					break;
				case '/':
					if (num2 != 0) {
						System.out.println((double)(num1) / (double)(num2));
					} else {
						System.out.println("ERROR. No se puede dividir por cero.");
					}
					break;
				default:
					System.out.println("ERROR. Ingreso un operador no valido.");
					break;
				}
			} else {
				flag = false;
			}
		} while (flag); 
		/////////////////////////////////////////////////
		input.close();
		System.out.println("FIN de la aplicación.");

	}

}
