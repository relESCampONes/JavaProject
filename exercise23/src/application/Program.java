package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		System.out.print("Enter the number of Employees: ");
		int numberEmployee = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberEmployee; i++) {
			System.out.printf("Employee #%d data:%n", i + 1);
			System.out.print("Outsource? (y or n): ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hours = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			if (answer == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				sc.nextLine();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sc.close();

	}

}
