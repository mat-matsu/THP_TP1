package thp.tp1.actividad3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		double altura;
		double suma = 0;
		int cont = 0;
		double prom;
		boolean flag = true;
		final double EXIT = 0;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(flag) {
			System.out.println("Ingrese la altura del " + (cont+1) + "� jugador o 0 para finalizar: ");
			altura = Double.parseDouble(input.nextLine());
			
			if (altura != EXIT) {
				suma += altura;
				cont++;
			} else {
				flag = false;
			}
		}
		input.close();
		/////////////////////////////////////////////////
		prom = suma / cont;
		System.out.println("El promedio de altura es: " + prom);

	}

}
