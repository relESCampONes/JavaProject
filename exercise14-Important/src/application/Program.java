package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int employeesRegistered = sc.nextInt();
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < employeesRegistered; i++) {
			sc.nextLine();
			System.out.printf("%nEmployee #%d%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (repeatIdBoolean(list, id)) {
				System.out.println("This Id already exists!Try again!");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.printf("%nEnter the employee id that will have salary increase: ");
		sc.nextLine();
		int number = sc.nextInt();
		Employee idInteger = list.stream().filter(x -> x.getIdInteger() == number).findAny().orElse(null);
//		Integer idInteger = hasIdInteger(list, number); // another way to find information within an object in the list
		if (idInteger == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			idInteger.salaryIncrease(percent);
//			list.get(idInteger).salaryIncrease(percent);
		}

		System.out.printf("%nList of employees: %n");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();
	}

//	public static Integer hasIdInteger(List<Employee> list, int id) {
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getIdInteger() == id) {
//				return i;
//			}
//		}
//		return null;
//	}

	public static boolean repeatIdBoolean(List<Employee> list, int id) {
		Employee test = list.stream().filter(x -> x.getIdInteger() == id).findFirst().orElse(null);
		return test != null;
	}
}
