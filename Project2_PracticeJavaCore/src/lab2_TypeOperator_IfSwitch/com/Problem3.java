package lab2_TypeOperator_IfSwitch.com;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
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
	
}
