package entities3;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double liquid() {
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		
		grossSalary += grossSalary * (percentage/100);
	}
	
	public String tostring() {
		return name + ", $" + String.format("%.2f", liquid());
	}

}
