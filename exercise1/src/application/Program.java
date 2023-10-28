package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Rectangle rectangle;
		rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the widht of the rectangle: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter the height of the rectangle: ");
		rectangle.height = sc.nextDouble();

		System.out.println(rectangle);
		sc.close();
	}

}
