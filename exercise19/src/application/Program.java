package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Worker worker;
		System.out.print("Enter the department's name: ");
		String departmentString = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String nameString = sc.nextLine();
		System.out.print("Level: ");
		String levelString = sc.nextLine();
		WorkerLevel workerLevel = WorkerLevel.valueOf(levelString);
		System.out.print("Base salary: ");
		double salaryDouble = sc.nextDouble();
		sc.nextLine();
		worker = new Worker(nameString, workerLevel, salaryDouble, new Department(departmentString));
		System.out.print("How many contracts to this worker? ");
		int contractInt = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < contractInt; i++) {
			System.out.printf("Enter contract #%d data: %n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			System.out.print("Duration (hours): ");
			int durationHours = sc.nextInt();
			sc.nextLine();
			worker.addContract(new HourContract(contractDate, valuePerHour, durationHours));
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
		sc.close();

	}

}
