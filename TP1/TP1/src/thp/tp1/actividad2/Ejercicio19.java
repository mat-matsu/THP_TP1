package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		int num;
		boolean esDeUnSoloDigito;
		boolean esImpar;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el un numero: ");
		num = input.nextInt();
		
		input.close();
		/////////////////////////////////////////////////
		esDeUnSoloDigito = num > 9?false:true;
		
		esImpar = (num%2) == 0?false:true;
		
		estaEnAmbos = esDeUnSoloDigito && esImpar?true:false;
		
		noEstaEnNinguno = !esDeUnSoloDigito && !esImpar?true:false;
		/////////////////////////////////////////////////
		if (estaEnAmbos) {
			System.out.println("Pertenece a ambos grupos.");
		} else if (noEstaEnNinguno) {
			System.out.println("No pertenece a ning�n grupo.");
		} else {
			if (esDeUnSoloDigito) {
				System.out.println("Pertenece al grupo de un solo d�gito.");
			} else {
				System.out.println("Pertenece al grupo impar.");
			}
		}
		
	}

}
