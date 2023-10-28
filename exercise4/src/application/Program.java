package application;

import java.util.Scanner;

import util.Calculator;

//import java.util.Locale;

public class Program {

	public static void main(String[] args) {

//		Locale.setDefault(Locale.US) para selecionar entrada de vírgula ou ponto

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		System.out.printf("PI value: %.2f", Calculator.PI);
		sc.close();
	}

}
