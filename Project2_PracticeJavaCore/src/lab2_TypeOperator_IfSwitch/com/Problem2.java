package lab2_TypeOperator_IfSwitch.com;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		double coefficientA = scanner.nextDouble();
		
		System.out.print("Enter coefficient B: ");
		double coefficientB = scanner.nextDouble();
		
		System.out.print("Enter coefficient C: ");
		double coefficientC = scanner.nextDouble();
		
		if(coefficientA == 0){
			SolveTheFirstOrderEquation(coefficientB,coefficientC);
		}
		else{
			double delta = Math.pow(coefficientB, 2)-4*coefficientA*coefficientC;
			double sqrtDelta = Math.sqrt(delta);
			
			if(delta<0){
				System.out.print("Equation has no solutions!");
			}
			else if(delta==0){
				double dualSolutionX = -coefficientB/(2*coefficientA);
				System.out.printf("Equation has dual solution X = %.2f",dualSolutionX);
			}
			else{
				double solutionX1 = (-coefficientB+sqrtDelta)/(2*coefficientA);
				double solutionX2 = (-coefficientB-sqrtDelta)/(2*coefficientA);
				System.out.printf("Equation has two different solution are:\nsolutionX1 = %.2f  solutionX2 = %.2f",solutionX1,solutionX2);
			}
		}
	}

	private static void SolveTheFirstOrderEquation(double coefficientB, double coefficientC) {
		
		if(coefficientB == 0){
			if(coefficientC == 0){
				System.out.print("Equation has countless solutions!");
			}
			else{
				System.out.print("Equation has no solutions!");
			}
		}
		else{
			double solutionX = -coefficientC/coefficientB;
			System.out.printf("Equation has one solution X = %.2f",solutionX);
		}
		
	}

}
