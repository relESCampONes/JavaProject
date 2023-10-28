package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		double mean = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("%d° number: ", i + 1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		System.out.printf("%nValues: ");
		for (double i : vect) {
			System.out.printf("%.2f ", i);
		}

		mean = sum / vect.length;

		System.out.printf("%nSum: %.2f%nMean: %.2f", sum, mean);

		sc.close();
	}

}
