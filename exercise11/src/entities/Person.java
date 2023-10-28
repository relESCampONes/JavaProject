package entities;

public class Person {

	private String name;
	private int old;
	private double height;

	public Person(String name, int old, double height) {
		this.name = name;
		this.old = old;
		this.height = height;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static double calculateMean(double mean, int total) {
		return mean / total;
	}

	public static double calculateUnderOld(double minor, int total) {
		return (minor / total) * 100;
	}

}
