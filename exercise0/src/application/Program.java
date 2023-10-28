package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measures of the triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of the tringle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX,areaY;
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("The area of the tringle x: %.2f%nThe area of the triangle y: %.2f%n",areaX,areaY);
		System.out.printf(areaX > areaY ? "The higher area: X": "The higher area: Y");
		
		sc.close();
		}

}
