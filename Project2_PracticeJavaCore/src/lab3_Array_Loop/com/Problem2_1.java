package lab3_Array_Loop.com;

import java.util.Scanner;

public class Problem2_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		
		System.out.println("Multiplication table of X is:");
		for(int i=1;i<=10;i++){
			System.out.printf("%d x %d = %d",x,i,x*i);
			System.out.println();
		}
		
	}

}
