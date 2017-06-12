package lab1_Scanner_PrintPrintlnPrintf_Math.com;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter edge of cube: ");
		double edge = scanner.nextDouble();
		
		double volume = Math.pow(edge, 3);
		
		System.out.printf("Volume of cube is: %.2f",volume);
		
	}

}
