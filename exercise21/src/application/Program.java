package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("\033[1;30m" + "Enter client data: " + "\033[0m");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		System.out.println("\033[1;30m" + "Enter order data: " + "\033[0m");
		System.out.print("Status: ");
		String status = sc.nextLine();
		OrderStatus orderStatus = OrderStatus.valueOf(status);
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		sc.nextLine();
		Order order = new Order(new Date(), orderStatus, new Client(name, email, sdf.parse(date)));
		for (int i = 0; i < items; i++) {
			System.out.printf("\033[1;30m" + "Enter #%d item data: \n" + "\033[0m", i + 1);
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			order.addItem(new OrderItem(quantity, new Product(nameProduct, price)));
		}

		System.out.println();
		System.out.println("\033[1;30m" + "ORDER SUMMARY:" + "\033[0m");
		System.out.println(order);

		sc.close();

	}

}
