package lab3_Array_Loop.com;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any integer: ");
		int N = scanner.nextInt();
		
		if(N<2){
			System.out.print("Wrong input. Number must be begin from 2!");
		}
		else{
			CheckPrimeNumber(N);
			
			if(CheckPrimeNumber(N)){
				System.out.printf("%d is a prime number!",N);
			}
			else{
				System.out.printf("%d is not a prime number!",N);
			}
		}
			
	}
	
	private static boolean CheckPrimeNumber(int N) {
		
		for(int i=2; i<N-1; i++){
			if(N%i==0){
				return false;
			}
			i++;
		}
		return true;
	
	}

	
}
