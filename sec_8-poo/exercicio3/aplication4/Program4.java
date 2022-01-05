package aplication4;

import java.util.Locale;
import java.util.Scanner;

import entities4.Aluno;

public class Program4 {
	
	public static void main(String[] args) {
		
		Aluno jorge;
		jorge = new Aluno();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		jorge.name = sc.nextLine();
		System.out.println("Nota do primeiro trimestre: ");
		jorge.n1 = sc.nextDouble();
		System.out.println("Nota do Segundo trimestre: ");
		jorge.n2 = sc.nextDouble();
		System.out.println("Nota do Terceiro trimestre: ");
		jorge.n3 = sc.nextDouble();
		
		jorge.Situation();
		
		sc.close();
	}

}
