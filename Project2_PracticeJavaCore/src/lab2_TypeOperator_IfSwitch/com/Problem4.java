package lab2_TypeOperator_IfSwitch.com;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {	
		
		menu();	
		
	}

	private static void menu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Solve the first order equation");
		System.out.println("2. Solve the quadratic equation");
		System.out.println("3. Calculate electricity money bill");
		System.out.println("4. Exit");
		System.out.println("+---------------------------------------------------+");

		System.out.print("Choose the option: ");
		int option = scanner.nextInt();
		
		if(option == 1){
			SolveTheFirstOrderEquation();
		}
		else if(option == 2){
			SolveTheQuadraticEquation();
		}
		else if(option == 3){
			CalculateElectricityMoneyBill();
		}
		else if(option == 4){
			System.exit(0);
		}
		else{
			System.out.print("Don't have this option. Please run program and choose other option again!");
		}
	}

	private static void CalculateElectricityMoneyBill() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Electric usege in a month is: ");
		double electric_usage = scanner.nextDouble();
		
		if(electric_usage<0){
			System.out.printf("Wrong electric usage input!");
		}
		else if(electric_usage>=0 && electric_usage<=50){
			double electric_bill = electric_usage*1000;
			System.out.printf("Electric bill in a month is: %.2f",electric_bill);
		}
		else{
			double electric_bill = 50*1000+(electric_usage-50)*1200;
			System.out.printf("Electric bill in a month is: %.2f",electric_bill);
		}
		
	}

	private static void SolveTheQuadraticEquation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter coefficient A: ");
		double coefficientA = scanner.nextDouble();
		
		System.out.print("Enter coefficient B: ");
		double coefficientB = scanner.nextDouble();
		
		System.out.print("Enter coefficient C: ");
		double coefficientC = scanner.nextDouble();
		
		if(coefficientA == 0){
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
				System.out.printf("Equation has one solution X= %.2f",solutionX);
			}
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

	private static void SolveTheFirstOrderEquation() {
		
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
