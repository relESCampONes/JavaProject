package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d° valor: ", i + 1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		double average = sum / n;

		System.out.printf("%nAverage: %.2f", average);
		sc.close();
	}

}
