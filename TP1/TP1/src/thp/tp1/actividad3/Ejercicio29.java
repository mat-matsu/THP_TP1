package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		int nota;
		final int NOTA_MIN = 0;
		final int NOTA_MAX = 10;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la nota: ");
		nota = Integer.parseInt(input.nextLine());
		
		while (nota < NOTA_MIN || nota > NOTA_MAX) {
			System.out.println("Error. Ingrese una nota entre " + NOTA_MIN + " y " + NOTA_MAX + ": ");
			nota = Integer.parseInt(input.nextLine());
		}
		
		input.close();
		
	}

}
