package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double aux;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el valor a almacenar en num1: ");
		num1 = input.nextDouble();
		
		System.out.println("Ingrese el valor a almacenar en num2: ");
		num2 = input.nextDouble();
		
		input.close();
		
		System.out.println("num1 = " + num1 + "\rnum2 = " + num2);
		/////////////////////////////////////////////////
		aux = num1;
		
		num1 = num2;
		
		num2 = aux;
		/////////////////////////////////////////////////
		System.out.println("num1 = " + num1 + "\rnum2 = " + num2);

	}

}
