package br.com.lira.exercicios;

import java.util.Scanner;

public class TesteNumerosInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			boolean Maiores = (B > C && D > A);
			boolean SomaMaiores = (C + D > A + B);
			boolean Positivos = (C > 0 && D > 0);
			boolean Par = (A % 2 == 0);
			
			if (Maiores && SomaMaiores && Positivos && Par) {
				System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores nao aceitos");
			}
		} finally {
			sc.close();
		}
	}

}
