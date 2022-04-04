package Initiate;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		int num;
		System.out.println("Guess the value!");
		do {
			System.out.println("Enter the correct value: ");
			num = value.nextInt();
		
		}
		while(num != 5);
		System.out.println("Got 5!");
	}
}
