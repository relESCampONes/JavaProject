package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}

		double average = sum / vect.length;

		System.out.printf("%nAverage: %.2f", average);

		sc.close();
	}

}
