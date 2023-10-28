package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Employee employee;
		employee = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the employer: ");
		employee.name = sc.nextLine();
		System.out.print("Enter the gross salary of the employer: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax of the employer: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);
		System.out.print("which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Update data: " + employee);
		sc.close();

	}

}
