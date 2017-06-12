package home.edu.vn;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to Java world!");
		start();
	}
	
	public static void start(){
		System.out.print("Nguyen Van");//print: not down the line
		System.out.println("Teo");//println: down the line
		System.out.println();
		String s = "Math";
		double d = 7.5;
		System.out.printf("Score of %s is %.2f",s,d);//printf: Used to transfer data from strings, numbers, ... 
	}

}