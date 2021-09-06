package br.com.lira.exercicios;

import java.util.Scanner;

public class NotasMoedas {

	public static void main(String[] args) {
		int cedula100 = 0, cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, moeda1 = 0, moeda050 = 0,
				moeda025 = 0, moeda010 = 0, moeda05 = 0, moeda01 = 0;

		Scanner ler = new Scanner(System.in);
		try {
			float valor = ler.nextFloat();
			float resto;

			cedula100 = (int) valor / 100;
			resto = valor % 100;
			
			if (resto > 0) {
				cedula50 = (int) resto / 50;
				resto = resto % 50;				
			}

			if (resto > 0) {
				cedula20 = (int) resto / 20;
				resto = resto % 20;				
			}
			
			if (resto > 0) {
				cedula10 = (int) resto / 10;
				resto = resto % 10;				
			}
			
			if (resto > 0) {
				cedula5 = (int) resto / 5;
				resto = resto % 5;				
			}
			
			if (resto > 0) {
				cedula2 = (int) resto / 2;
				resto = resto % 2;				
			}
			
			if (resto > 0) {
				moeda1 = (int) resto;			
				resto = resto % 1; 
			}
			
			if (resto > 0) {
				moeda050 = (int) (resto / 0.5);			
				resto = (float) (resto % 0.5); 
			}
			
			if (resto > 0) {
				moeda025 = (int) (resto / 0.25);			
				resto = (float) (resto % 0.25); 
			}
			
			if (resto > 0) {
				moeda010 = (int) (resto / 0.10);			
				resto = (float) (resto % 0.10); 
			}
			
			if (resto > 0) {
				moeda05 = (int) (resto / 0.05);			
				resto = (float) (resto % 0.05); 
			}
			
			if (resto > 0) {
				moeda01 = (int) Math.round(resto / 0.01);					 
			}
			
			System.out.println("NOTAS:");
			System.out.println(cedula100 + " nota(s) de R$ 100.00");
			System.out.println(cedula50 + " nota(s) de R$ 50.00");
			System.out.println(cedula20 + " nota(s) de R$ 20.00");
			System.out.println(cedula10 + " nota(s) de R$ 10.00");
			System.out.println(cedula5 + " nota(s) de R$ 5.00");
			System.out.println(cedula2 + " nota(s) de R$ 2.00");
			System.out.println("MOEDAS:");
			System.out.println(moeda1 + " moeda(s) de R$ 1.00");
			System.out.println(moeda050 + " moeda(s) de R$ 0.50");
			System.out.println(moeda025 + " moeda(s) de R$ 0.25");
			System.out.println(moeda010 + " moeda(s) de R$ 0.10");
			System.out.println(moeda05 + " moeda(s) de R$ 0.05");
			System.out.println(moeda01 + " moeda(s) de R$ 0.01");
			
		} finally {
			ler.close();
		}

	}

}
