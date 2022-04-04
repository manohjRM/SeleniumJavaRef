package initiated;

import java.util.Scanner;

public class switchCase {
	static Scanner input = new Scanner(System.in);
	
	void switchCaseStatement(int num) {
		switch (num) {
		case (10):
			System.out.println("10");
			break;
		case (20):
			System.out.println("20");
			break;
		default:
			System.out.println("Neither 10 nor 20");
		}
	}
	
	public static void main(String[] args) {
		switchCase func = new switchCase();
		System.out.println("Enter a number:");
		int number = input.nextInt();
		func.switchCaseStatement(number);
	}
}
