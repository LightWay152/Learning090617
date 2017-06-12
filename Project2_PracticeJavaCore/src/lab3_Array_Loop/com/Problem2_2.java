package lab3_Array_Loop.com;

import java.util.Scanner;

public class Problem2_2 {

	public static void main(String[] args) {
		
		System.out.println("Multiplication table is:");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=10;j++){
				System.out.printf("%d x %d = %d",i,j,i*j);
				System.out.println();
			}	
			System.out.println();
		}
		
	}

}
