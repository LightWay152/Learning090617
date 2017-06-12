package lab1_Scanner_PrintPrintlnPrintf_Math.com;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle: ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter width of rectangle: ");
		double width = scanner.nextDouble();
		
		double perimeter = (length+width)*2;
		double area = length*width;
		double minEdge = Math.min(length, width);
		
		System.out.printf("Perimeter of rectangle is: %.2f\n",perimeter);
		System.out.printf("Area of rectangle is: %.2f\n",area);
		System.out.printf("Min of rectangle is: %.2f",minEdge);
		
	}

}
