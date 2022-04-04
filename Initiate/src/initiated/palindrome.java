package initiated;
import java.util.*;

class palin{
	void str(String in) {
		String org = in;
		String dup = "";
		int l = org.length();
		
		for(int i = l-1; i>=0; i--) {
			dup = dup + org.charAt(i); 	
		}
		
		if (org.equals(dup)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}

class palinnum{
	void num(int n) {
		int sum = 0, rev, x;
		x = n;
		
		while(n>0) {
			rev = n%10;
			sum = (sum*10)+rev;
			n = n/10;
		}
		if (x==sum) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}

public class palindrome {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		palin strobj = new palin();
		System.out.println("Enter the word to check:");
		String str = input.nextLine();
		strobj.str(str);
		
		palinnum numobj = new palinnum();
		System.out.println("Enter the number to check:");
		int num = input.nextInt();
		numobj.num(num);
	}
}
