package aplication3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Employee;

public class Program3 {

	public static void main(String[] args) {
		
		Employee x;
		x = new Employee();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		x.name = sc.nextLine();
		System.out.println("GrossSalary: ");
		x.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x.tostring());
		System.out.println();
		System.out.println("Whitch percentage to increase salary? ");
		double percent = sc.nextDouble();
		x.increaseSalary(percent);
		
		System.out.println("Updated Data: " + x.tostring());

		sc.close();
	}

}
