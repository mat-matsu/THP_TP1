package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		/////////////////////////////////////////////////
		String user;
		String pass;
		boolean flag = true;
		int intento = 0;
		final int INTENTOS = 3;
		final String USER_ADMIN = "admin";
		final String PASS_ADMIN = "123456";
		final String MSJ_CONCEDIDO = "Acceso concedido.";
		final String MSJ_BLOQUEO = "Se ha bloqueado la cuenta.";
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);

		while (flag && intento < INTENTOS) {
			System.out.println("Ingrese su usuario: ");
			user = input.nextLine();
			
			System.out.println("Ingrese su password: ");
			pass = input.nextLine();

			if (user.equals(USER_ADMIN) && pass.equals(PASS_ADMIN)) {
				System.out.println(MSJ_CONCEDIDO);
				flag = false;
			} else {
				intento++;
				if (intento == INTENTOS) {
					System.out.println(MSJ_BLOQUEO);
				} else {
					System.out.println("ERROR. El usuario o password es incorrecto. Le quedan " + (INTENTOS - intento) + " intentos.");
				}
			}
		}
		/////////////////////////////////////////////////
		input.close();

	}

}
