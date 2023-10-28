package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number size of the vector: ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int[] vect_negative = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%d° value: ", i + 1);
			vect[i] = sc.nextInt();
			if (vect[i] < 0) {
				vect_negative[i] = vect[i];
			}
		}

		System.out.printf("%nNegative numbers: %n");

		for (int i : vect_negative) {
			if (i < 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
