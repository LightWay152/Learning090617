package lab2_TypeOperator_IfSwitch.com;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		double coefficientA = scanner.nextDouble();
		
		System.out.print("Enter coefficient B: ");
		double coefficientB = scanner.nextDouble();
		
		if(coefficientA == 0){
			if(coefficientB == 0){
				System.out.print("Equation has countless solutions!");
			}
			else{
				System.out.print("Equation has no solutions!");
			}
		}
		else{
			double solutionX = -coefficientB/coefficientA;
			System.out.printf("Equation has one solution X= %.2f",solutionX);
		}
		
	}

}
