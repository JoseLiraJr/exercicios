package br.com.lira.exercicios;

import java.util.Scanner;

public class ConversaoTempo {

	public static void main(String[] args) {
		final int HORA = 3600;
		final int MINUTO = 60;		

		Scanner ler = new Scanner(System.in);
		try {

			int tempoLido = ler.nextInt();

			int horas = 0;
			int minutos = 0;
			int segundos = 0;
			int restoDivisao = 0;

			horas = tempoLido / HORA;
			restoDivisao = tempoLido % HORA;

			if (restoDivisao > 0) {
				minutos = restoDivisao / MINUTO;
				restoDivisao = restoDivisao % MINUTO;
			}
			
			if (restoDivisao > 0) {
				segundos = restoDivisao;
			}
			
			System.out.println(horas + ":" + minutos + ":" + segundos);

		} finally {
			ler.close();
		}
	}

}
