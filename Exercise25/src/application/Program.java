package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<Shape>();

		System.out.print("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberShapes; i++) {
			System.out.printf("Shape #%d data:\n", i + 1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char chooseShape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (chooseShape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));

			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}

}
