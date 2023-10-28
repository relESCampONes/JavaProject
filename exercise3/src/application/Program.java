package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Student student;
		student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		student.name = sc.nextLine();
		System.out.print("Enter the first grade: ");
		student.firstGrade = sc.nextDouble();
		System.out.print("Enter the second grade: ");
		student.secondGrade = sc.nextDouble();
		System.out.print("Enter the thirth grade: ");
		student.thirthGrade = sc.nextDouble();

		System.out.println(student);
		sc.close();

	}

}
