package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double ancho;
		double largo;
		double valorM2;
		double area;
		double perim;
		double valorTerreno;
		double mtsAlambre;
		final int ALT_ALAMBRE = 3;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el ancho: ");
		ancho = input.nextDouble();
		
		System.out.println("Ingrese el largo: ");
		largo = input.nextDouble();
		
		System.out.println("Ingrese el valor del m2: ");
		valorM2 = input.nextDouble();
		
		input.close();
		
		/////////////////////////////////////////////////
		area = ancho * largo;
		
		perim = (ancho * 2) + (largo * 2);
		
		valorTerreno = area * valorM2;
		
		mtsAlambre = perim * ALT_ALAMBRE;
		/////////////////////////////////////////////////
		System.out.println("El valor del terreno es de: $" + valorTerreno);
		System.out.println("La cantidad de metros para " + ALT_ALAMBRE + " alturas distintas es: " + mtsAlambre + "mts");
		
	}

}
