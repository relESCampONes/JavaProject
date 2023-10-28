package entities;

public class Student {
	
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirthGrade;
	
	
	public double finalGrade() {
		return firstGrade + secondGrade + thirthGrade;
	}

	public String result() {
		if (finalGrade() >= 60) {
			return "PASS";
		}else {
			return "FAILED" + String.format("%n") + "MISSING " + String.format("%.2f", missing()) + " POINTS";
		}
	}
	
	public double missing() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + String.format("%n") + result();
	}
}
