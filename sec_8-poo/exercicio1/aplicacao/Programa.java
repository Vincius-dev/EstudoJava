package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import elementos.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Retangulo x;
		x = new Retangulo();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		
		System.out.println("AREA = " + area);
		System.out.println("PERIMETER = " + perimeter);
		System.out.println("DIAGONAL = " + diagonal);
		sc.close();
	}

}
