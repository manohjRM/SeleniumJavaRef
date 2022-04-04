package initiated;

import java.util.Scanner;

public class pattern {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the count: ");
		int count = input.nextInt();
		
		for(int i=1;i<=count;i++) {
			for(int s=i;s<count;s++) {
				System.out.printf(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
