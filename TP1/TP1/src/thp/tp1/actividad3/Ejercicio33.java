package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		int num;
		boolean flag = true;
		int max = -999999999;
		int min = 999999999;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un n�mero entero o ingrese 0 para finalizar: ");
			num = Integer.parseInt(input.nextLine());
			
			if (num != 0) {
				max = num>max?num:max;
				
				min = num<min?num:min;
			} else {
				flag = false;
			}
			
		} while (flag);
		input.close();
		/////////////////////////////////////////////////
		System.out.println("El n�mero m�s grande ingresado es: " + max);
		System.out.println("el n�mero m�s bajo ingresado es: " + min);

	}

}
