package br.com.lira.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormulaBhaskara {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00000");
		Scanner sc = new Scanner(System.in);
		try {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();

			double Delta = (Math.pow(B, 2)) - (4 * A * C);

			if (Delta < 0 || A == 0) {
				System.out.println("Impossivel calcular");
				return;
			}

			double X1 = ((- B + Math.sqrt(Delta))/(2 * A));
			double X2 = ((- B - Math.sqrt(Delta))/(2 * A));

			System.out.println("R1 = " + df.format(X1));
			System.out.println("R2 = " + df.format(X2));

		} finally {
			sc.close();
		}

	}

}
