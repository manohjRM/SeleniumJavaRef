package Initiate;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = value.nextLine();
		System.out.println("Your name is: "+Name);
		System.out.println("Enter your age: ");
		int age = value.nextInt();
		System.out.println("Your age is:"+ age);
	}
}
