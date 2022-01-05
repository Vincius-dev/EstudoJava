package entities4;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double Grade() {
		
		return n1 + n2 + n3;
		
	}
	
	private double MissingPoints() {
		
		return 60 - Grade();
	}
	
	public void Situation() {
		
		if (Grade() >= 60) {
			System.out.println("FINAL GRADE: " + Grade());
			System.out.println("PASS");
		}
		
		else {
			System.out.println("FINAL GRADE: " + Grade());
			System.out.println("FAILED");
			System.out.println("MISSING " + MissingPoints() + " POINTS");
		}
	} 

}
