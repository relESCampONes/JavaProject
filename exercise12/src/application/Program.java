package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		Person[] rent = new Person[10];
		for (int i = 0; i < rooms; i++) {
			sc.nextLine();
			System.out.printf("%nRent #%d: %n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room - 1] = new Person(name, email, room - 1);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (Person i : rent) {
			if (i != null) {
				System.out.printf("%d: %s%n", i.getRoom() + 1, i);
			}
		}

		sc.close();

	}

}
