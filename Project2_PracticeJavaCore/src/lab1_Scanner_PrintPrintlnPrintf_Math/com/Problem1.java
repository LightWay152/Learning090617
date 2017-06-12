package lab1_Scanner_PrintPrintlnPrintf_Math.com;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Full name: ");
		String fullName = scanner.nextLine();
		
		System.out.print("Average score: ");
		double averageScore = scanner.nextDouble();
		
		System.out.printf("%s %.2f score",fullName,averageScore);
		
	}

}
