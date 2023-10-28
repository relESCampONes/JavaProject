package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		System.out.print("Enter the number of products: ");
		int numberProduct = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberProduct; i++) {
			System.out.printf("Product #%d data:%n", i + 1);
			System.out.print("Common, used or imported? (c/u/i): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			if (choice == 'c') {
				products.add(new Product(name, price));
			} else if (choice == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.nextLine();
				products.add(new UsedProduct(name, price, sdf.parse(dateString)));
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
