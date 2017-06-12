package lab3_Array_Loop.com;

import java.util.Scanner;

public class Problem3 {
	
	private Integer arr[];
	private int numOfElements;
	private int minElement;
	private double averageElementDividedBy3;
	
	public static void main(String[] args) {
		
		Problem3 pro3 =new Problem3();
		pro3.initArray();	
		System.out.print("Initialize array is:");
		pro3.displayArray();
		
		pro3.sortArray();
		System.out.print("\nSorted array is:");
		pro3.displayArray();
		
		pro3.minArray();
		
		pro3.averageElementsDividedBy3();
			
	}

	private void averageElementsDividedBy3() {
		
		int num = 0;
		int elementDividedBy3 = 0;
		
		for(int i=0;i<this.numOfElements;i++){
          if(this.arr[i]%3==0){
        	  elementDividedBy3+=this.arr[i];
        	  num++;
        	  averageElementDividedBy3 = elementDividedBy3/num;
          }      
		}
		System.out.print("\nAverage element divided by 3 is: "+averageElementDividedBy3);
		
	}

	private void minArray() {
		
		minElement = arr[0];
		
		for(int i=0;i<this.numOfElements;i++){
          if(this.arr[i]<minElement){
        	  minElement=this.arr[i];
          }      
		}
		System.out.print("\nMin element in array is: "+minElement);
		
	}

	public void initArray(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer N: ");
		this.numOfElements = input.nextInt();
		
		this.arr=new Integer[numOfElements];
		
		for(int i=0;i<this.numOfElements;i++){
			System.out.print("Enter element["+i+"]:");
			this.arr[i]=new Integer(input.nextInt());
		}	
		
	}
	
	public void sortArray() {

		int temp=0;
        for(int i=0;i<this.numOfElements;i++){
            for(int j=i+1;j<this.numOfElements;j++)
                if(i<j && this.arr[i]>this.arr[j]){
	                temp=this.arr[j];
	                this.arr[j]=this.arr[i];
	                this.arr[i]=temp;
            }
        } 
		
	}
	
	public void displayArray(){
		
		for(int i=0;i<this.numOfElements;i++){
			System.out.print(" " + this.arr[i] + " ");
		}
		
	}

}
