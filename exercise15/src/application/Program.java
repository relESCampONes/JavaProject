package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the matrix: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int quantity = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					quantity++;
				}
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.printf("%nNegative numbers = %d", quantity);

		sc.close();
	}

}
