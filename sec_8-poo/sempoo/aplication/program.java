package aplication;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, ya, za, areaa, pa;
		double xb, yb, zb, areab, pb;
		
		System.out.println("Enter the measures of triangle X:");
		xa = sc.nextDouble();
		ya = sc.nextDouble();
		za = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		xb = sc.nextDouble();
		yb = sc.nextDouble();
		zb = sc.nextDouble();
		
		pa = (xa + ya + za)/2.0;
		pb = (xb + yb + zb)/2.0;
		
		areaa = Math.sqrt(pa * (pa-xa) * (pa-ya) * (pa-za));
		areab = Math.sqrt(pb * (pb-xb) * (pb-yb) * (pb-zb));
		
		System.out.println("Triangle X area: " + areaa);
		System.out.println("Triangle Y area: " + areab);
		
		if (areaa > areab) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}
}
