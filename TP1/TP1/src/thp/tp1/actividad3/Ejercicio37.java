package thp.tp1.actividad3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) throws ParseException {
		/////////////////////////////////////////////////
		int mesNumero = 1;
		Date d;
	    Calendar cal = Calendar.getInstance();
	    String mesNombre;
	    /////////////////////////////////////////////////
		double sueldo;
		double total = 0;
		boolean flag = true;
		final int EXIT = 0;
		final int MES_EXIT = 12;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(flag) {
			d = new SimpleDateFormat("MM", Locale.ENGLISH).parse(String.valueOf(mesNumero));
			cal.setTime(d);
			mesNombre = new SimpleDateFormat("MMMM").format(cal.getTime());
			System.out.println("Ingrese el sueldo del mes de " + mesNombre + ": ");
			sueldo = Double.parseDouble(input.nextLine());
			
			if (sueldo < EXIT) {
				flag = false;
			} else if (mesNumero == MES_EXIT) {
				total+= sueldo;
				flag = false;
			} else {
				mesNumero++;
				total+= sueldo;
			}
		}
		input.close();
		/////////////////////////////////////////////////
		if (mesNumero != MES_EXIT) {
			System.out.println("El sueldo parcial es de: $" + total);
		} else {
			System.out.println("El sueldo total es de: $" + total);
		}
	}

}
