package home.edu.vn;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {

		System.out.printf("Enter a: ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		System.out.printf("Enter b: \n");
		double b = scanner.nextDouble();
		
		double c = Math.pow(a, b);
		double d = Math.sqrt(c);
		double e = Math.min(a, b);
		double f = Math.sin(d);
		
		double g = 5 + 10*Math.random();
		double h = Math.ceil(8.42);
		double i = Math.round(g);
		
		System.out.printf("Math.pow(%.2f,%.2f)=%.2f\n",a,b,c);
		System.out.printf("Math.sqrt(%.2f)=%.2f\n",c,d);
		System.out.printf("Math.min(%.2f,%.2f)=%.2f\n",a,b,e);
		System.out.printf("Math.sin(%.2f)=%.2f\n",d,f);
		System.out.printf("Math.random(%.2f)=%.2f\n",d,f);
		System.out.printf("Math.ceil(8.42)=%.2f\n",h);
		System.out.printf("Math.round(%.2f)=%.2f",g,i);
		
	}

}
