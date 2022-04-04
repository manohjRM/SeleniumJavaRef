package initiated;

import java.util.Scanner;

public class calc {
	static int bonus = 5;//static variable
	void addition(int a,int b) 
	{
		int c = a + b;//local variable
		System.out.println("Sum of the numbers are: "+c);
	}
	void subraction(int a,int b) {
		int c = a - b;//local variable
		System.out.println("Subraction of the numbers are: "+c);
	}
	void multiplication(int a,int b) {
		int c = a * b;//local variable
		System.out.println("Multiplication of the numbers are: "+c);
	}
	void division(float a,float b) {
		float c = a / b;//local variable
		System.out.printf("Division of the numbers are: %.4f",c);
	}
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int n = value.nextInt();//instance variable
		System.out.println("Enter the second value: ");
		int m = value.nextInt();//instance variable
		m = m+bonus;
		calc c = new calc();
		c.addition(n, m);
		c.subraction(n, m);
		c.multiplication(n, m);
		c.division(n, m);
	}
}
