package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String mensagem = "SOMA:";
		
		int var1;
		int var2;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		var1 = sc.nextInt();
		var2 = sc.nextInt();
		
		resultado = var1 + var2;
		
		System.out.println(mensagem + resultado);
		
	}

}
