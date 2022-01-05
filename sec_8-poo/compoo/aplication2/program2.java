package aplication2;

import java.util.Locale;
import java.util.Scanner;

import elements.Triangle;

public class program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double rX = x.area();
		double rY = y.area();
	
		System.out.println("Triangle X area: " + rX);
		System.out.println("Triangle Y area: " + rY);
		
		if (rX > rY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}
}
