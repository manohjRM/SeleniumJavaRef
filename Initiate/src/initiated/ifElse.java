package initiated;

import java.util.Scanner;

public class ifElse {
	void ifElseStatement(int a, int b) {
		if (a<b) {
			System.out.println("a value is less than b");
		}
		else {
			System.out.println("a value is greater than b");
		}
	}
	
	void ifElseLStatement(int a, int b) {
		if (a<b) {
			System.out.println("a value is less than b");
		}
		else if (a==b) {
			System.out.println("a value is equal to b");
		}
		else {
			System.out.println("a value is greater than b");
		}
	}
	
	void nestedIf(int a, int b) {
		if (a!=b) {
			if (a<b) {
				System.out.println("a value is less than b");
			}
			else {
				System.out.println("a value is greater than b");
			}
		}
		else {
			System.out.println("a value is equal to b");
		}
	}
	void ternaryCondition(int a, int b) {
		String result = a<b?"a value is less than b":"a value is greater than b";
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = input.nextInt();
		double n = input.nextDouble();
		System.out.println("Enter the another number:");
		String s = input.nextLine();
		int b = input.nextInt();
		ifElse cond = new ifElse();
		cond.ifElseStatement(a, b);
		cond.ifElseLStatement(a, b);
		cond.nestedIf(a, b);
		cond.ternaryCondition(a, b);
	}

}
