package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		double aporte1;
		String nombre1;
		double porc1;
		double aporte2;
		String nombre2;
		double porc2;
		double aporte3;
		String nombre3;
		double porc3;
		double total;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese su nombre: ");
		nombre1 = input.nextLine();
		
		System.out.println("Ingrese su aporte: ");
		aporte1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese su nombre: ");
		nombre2 = input.nextLine();
		
		System.out.println("Ingrese su aporte: ");
		aporte2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese su nombre: ");
		nombre3 = input.nextLine();
		
		System.out.println("Ingrese su aporte: ");
		aporte3 = Double.parseDouble(input.nextLine());
		
		input.close();
		
		/////////////////////////////////////////////////
		total = aporte1 + aporte2 + aporte3;
		
		porc1 = (aporte1 * 100) / total;
		porc2 = (aporte2 * 100) / total;
		porc3 = (aporte3 * 100) / total;
		
		/////////////////////////////////////////////////
		System.out.println("El socio " + nombre1 + " aporto " + porc1 + "%.");
		System.out.println("El socio " + nombre2 + " aporto " + porc2 + "%.");
		System.out.println("El socio " + nombre3 + " aporto " + porc3 + "%.");
		
	}

}
