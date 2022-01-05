package fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int F;
		int X = 5;
		int Y = 32;
		String R;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite a temperatura em Celsius:");
			int C = sc.nextInt();
			F = (9*C)/X + Y;
			System.out.println("Equivalente em Fahrenheit:" + F);
			System.out.println("Deseja repetir? (s/n)");
			R = sc.next();
	
		} while(R != "n");
		
		sc.close();

	}

}
