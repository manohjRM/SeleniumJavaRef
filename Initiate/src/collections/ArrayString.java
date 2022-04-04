package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayString {
	
	public static void main(String[] args) {
		List<String> num = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		
		int m = input.nextInt();
		
		for(int i =0; i<m;i++) {
			String name = input.nextLine();
			num.add(name);
			System.out.println(name+" added to the list");
			
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
