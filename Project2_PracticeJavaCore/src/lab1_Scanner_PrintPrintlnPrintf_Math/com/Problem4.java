package lab1_Scanner_PrintPrintlnPrintf_Math.com;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		double coefficientA = scanner.nextDouble();
		
		System.out.print("Enter coefficient B: ");
		double coefficientB = scanner.nextDouble();
		
		System.out.print("Enter coefficient C: ");
		double coefficientC = scanner.nextDouble();
		
		double delta = Math.pow(coefficientB, 2)-4*coefficientA*coefficientC;
		double sqrtDelta = Math.sqrt(delta);
		
		System.out.printf("Square root of Delta is: %.2f",sqrtDelta);
		
	}

}
