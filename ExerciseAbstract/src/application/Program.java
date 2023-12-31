package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {

		List<TaxPayers> list = new ArrayList<TaxPayers>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberPayers; i++) {
			System.out.printf("Tax payer #%d data: %n", i + 1);
			System.out.print("Individual or Company (i/c)? ");
			char choosePayer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			if (choosePayer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, anualIncome, employees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for (TaxPayers payer : list) {
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.taxesPaid());
			total += payer.taxesPaid();
		}

		System.out.printf("%nTOTAL TAXES: $ %.2f", total);

		sc.close();
	}

}
