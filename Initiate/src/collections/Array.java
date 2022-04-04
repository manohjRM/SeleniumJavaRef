package collections;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		
		int m = input.nextInt();
		
		for(int i =0; i<m;i++) {
			int number = input.nextInt();
			num.add(number);
			System.out.println(number+" added to the list");
			
		}
		System.out.println(num);
		
		try {
			System.out.println("Enter the index want to displayed:");
			int n = input.nextInt();
			System.out.println(num.get(n));
		}
		catch(Exception e) {
			System.out.println("You have entered the wrong value of index");
		}
		
		
	}
	
}
