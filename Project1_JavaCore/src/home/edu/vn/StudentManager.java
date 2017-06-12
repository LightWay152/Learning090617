package home.edu.vn;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String fullName = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = scanner.nextByte();
		
		System.out.print("Enter your score: ");
		double score = scanner.nextDouble();
		
		System.out.printf("\nYour info is: %s %s %s",fullName,age,score);
		
	}

}
