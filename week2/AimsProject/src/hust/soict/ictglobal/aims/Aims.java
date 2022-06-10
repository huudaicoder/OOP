package hust.soict.ictglobal.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.ictglobal.aims.media.Book;
import hust.soict.ictglobal.aims.media.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.Order;

public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void main(String[] args) {
		List<Order> listOfOrders = new ArrayList<Order>();
		int numericalOrder = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			showMenu();
			int option = scanner.nextInt();
			switch (option) {
				case 1:
					Order order = Order.createOrder();
					listOfOrders.add(order);
					System.out.println();
					break;
				case 2:
					System.out.print("Which type of item do you want to add? (Book, CD or DVD)?\n" + 
					"If book, type Book\n" +					
					"If DVD, type DVD\n" + 
					"Enter your choice (case is insensitive) : ");
					String choice = scanner.next();
					if (choice.equalsIgnoreCase("book")) {
						Book book = new Book();
						book.setTitle("War and Peaceful");
						book.setCategory("Rusia");
						book.setCost(100);
						listOfOrders.get(numericalOrder).addMedia(book);	
						numericalOrder++;
					} else if (choice.equalsIgnoreCase("dvd")) {
						DigitalVideoDisc dvd = new DigitalVideoDisc();
						dvd.setTitle("ict");
						dvd.setCategory("soict");
						dvd.setCost(350);					
					}
					System.out.println();
					break;
				case 3:
					break;
				case 4:
					for (int i = 0; i < listOfOrders.size(); i++) {
						listOfOrders.get(i).printTheInfoOfOrder();
						System.out.println();
					}
					break;
				case 0:
					System.exit(0);
			}
		} while (true);
	}

}
