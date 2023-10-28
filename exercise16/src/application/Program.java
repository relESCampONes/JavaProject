package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number lines of the matrix: ");
		int n = sc.nextInt();
		System.out.print("Enter the number columns of the matrix: ");
		int m = sc.nextInt();
//		sc.nextLine();
		System.out.printf("Matrix: %dx%d%n", n, m);
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Enter the number of the position map: ");
		sc.nextLine();
		int position = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == position) {
					System.out.printf("Position: %d,%d%n", i, j);
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (i < (n - 1)) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
					if (j < (m - 1)) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
				}
			}
		}

		sc.close();

	}

}
