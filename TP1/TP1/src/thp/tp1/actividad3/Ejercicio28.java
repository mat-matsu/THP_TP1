package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		int cant;
		int num;
		int pos = 0;
		int mayor = -999999999;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de n�meros que va a ingresar: ");
		cant = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese el " + i + "� n�mero: ");
			num = Integer.parseInt(input.nextLine());
			
			if (num > mayor) {
				mayor = num;
				pos = i;
			}
		}
		input.close();
		/////////////////////////////////////////////////
		System.out.println("El n�mero m�s alto ingresado es: " + mayor);
		System.out.println("Y su posicion es: " + pos);

	}

}
