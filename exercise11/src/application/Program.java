package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		Person[] personalData = new Person[n];
		String[] minorPersons = new String[n];
//		Person person = new Person();
		double mean = 0.0;
		double minor = 0.0;

		for (int i = 0; i < personalData.length; i++) {
			System.out.printf("%d° person data: %n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Old: ");
			int old = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			personalData[i] = new Person(name, old, height);
		}

		for (int i = 0; i < personalData.length; i++) {
			mean += personalData[i].getHeight();
			if (personalData[i].getOld() < 16) {
				minorPersons[i] = personalData[i].getName();
				minor += 1;
			}
		}

		System.out.printf("%nAverage height: %.2f%n", Person.calculateMean(mean, personalData.length));
		System.out.println("People under 16: " + Person.calculateUnderOld(minor, personalData.length) + "%");
		for (String i : minorPersons) {
			if (i != null) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
