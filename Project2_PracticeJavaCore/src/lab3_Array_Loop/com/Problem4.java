package lab3_Array_Loop.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
	
	//Problem still have error!

	private String arrName[];
	private Double arrScore[];
	private int numOfStudent;
	
	public static void main(String[] args) {
		
		Problem4 pro4 =new Problem4();
		pro4.initArray();	
		System.out.print("Initialize array is:");
		pro4.displayArray();
		
	}
	
	public void initArray(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of student: ");
		this.numOfStudent = input.nextInt();
		
		for(int i=0;i<this.numOfStudent;i++){
			System.out.print("Enter student's info["+i+"]:");
			this.arrName[i]=new String(input.toString());
			this.arrScore[i]=new Double(input.nextDouble());
		}	
		
	}
	
	public void displayArray(){
		
		for(int i=0;i<this.numOfStudent;i++){
			System.out.print(" " + this.arrName[i] + " " + this.arrScore[i] + "\n");
		}
		
	}

}
