package assignment;

import java.util.Scanner;

class decision{
	void interest(boolean cibilScore){
		System.out.println("You have low cibil score");
		System.out.println("You ROI will be 18%");
		//System.out.println(cibilScore);
	}
	
	void interest(boolean cibilScore, boolean loanScore) {
		System.out.println("You have average cibil score");
		System.out.println("You ROI will be 12%");
		//System.out.println(cibilScore);
	}
	
	void interest() {
		System.out.println("You have good cibil score");
		System.out.println("You ROI will be 8%");
	}
}
public class roi {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean cibilScore;
		boolean loanScore;
		
		decision obj = new decision();
		
		System.out.println("Is your cibil score greater than 700? (Enter y or n)");
		String cibil = input.nextLine();
		
		if (cibil.equals("yes")){
			cibilScore = true;
			System.out.println("Do you have existing loan? (Enter y or n)");
			String loan = input.nextLine();
			if (loan.equals("yes")) {
				loanScore = true;
				obj.interest(cibilScore,loanScore);
			}
			else if (loan.equals("no")){
				loanScore = false;
				obj.interest();
			}
		}
		else {
			cibilScore = false;
			obj.interest(cibilScore);
		}
		
	}
}
