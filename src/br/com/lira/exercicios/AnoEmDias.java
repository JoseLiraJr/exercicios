package br.com.lira.exercicios;

import java.util.Scanner;

public class AnoEmDias {

	public static void main(String[] args) {

		final int ANO = 365;
		final int MES = 30;

		int Anos = 0;
		int Meses = 0;
		int Dias = 0;

		Scanner ler = new Scanner(System.in);
		try {
			int DiasLido = ler.nextInt();

			Anos = DiasLido / ANO;
			int Resto = DiasLido % ANO;

			if (Resto > 0) {
				Meses = Resto / MES;
				Resto = Resto % MES;
			}

			if (Resto > 0) {
				Dias = Resto;
			}

			System.out.println(Anos + " ano(s)");
			System.out.println(Meses + " mes(es)");
			System.out.println(Dias + " dia(s)");

		} finally {
			ler.close();
		}
	}

}
