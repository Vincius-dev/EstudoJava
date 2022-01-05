package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
		//dá direito a 100 minutos de telefone. Cada minuto que exceder a
		//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
		//a ser pago
		
		int tempo;
		int custoExtra = 2;
		int custoMinuto = 100;
		int custoBase = 50;
		int custoFinal;
		String mensagem = "Digite quanto tempo levou a chamada(Minutos)";
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(mensagem);
		tempo = sc.nextInt();
		
		if (tempo > 100) {
			custoFinal = custoBase + (tempo - custoMinuto) * custoExtra;
			System.out.printf("O custo final foi:");
			System.out.println(custoFinal);

		}
		else{
			custoFinal = 50;
			System.out.printf("O custo final foi:");
			System.out.println(custoFinal);
		}
		
	}

}
