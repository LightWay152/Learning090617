package home.edu.vn;

import java.util.Scanner;

public class CalculateAddSub {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Exit");
		System.out.print(">> Choose the option? ");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		if (option == 1) {
			add();
		} else if (option == 2) {
			sub();
		} else if (option == 3) {
			System.exit(0);
		} else {
			System.out.print("Please run progam again and enter the option (1,2,3)!");
		}
	}

	private static void sub() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter number b: ");
		double b = scanner.nextDouble();

		double c = a - b;

		System.out.printf("Sub of %.2f and %.2f is: %.2f", a, b, c);
	}

	private static void add() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter number b: ");
		double b = scanner.nextDouble();

		double c = a + b;

		System.out.printf("Sum of %.2f and %.2f is: %.2f", a, b, c);
	}
	
}
