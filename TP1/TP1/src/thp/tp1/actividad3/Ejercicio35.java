package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		int edad;
		String nombre;
		int menorEdad = 200;
		String masJoven = "";
		boolean flag = true;
		final String EXIT = "*";
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		while(flag) {
			System.out.println("Ingrese el nombre: ");
			nombre = input.nextLine();
			
			if (!nombre.equals(EXIT)) {
				System.out.println("Ingrese la edad de " + nombre + ": ");
				edad = Integer.parseInt(input.nextLine());
				
				if (edad < menorEdad) {
					menorEdad = edad;
					masJoven = nombre;
				}
			} else {
				flag = false;
			}
		}
		input.close();
		/////////////////////////////////////////////////
		System.out.println("El mas joven es: " + masJoven);

	}

}
