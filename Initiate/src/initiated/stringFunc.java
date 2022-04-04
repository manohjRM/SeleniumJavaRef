package initiated;
import java.util.Scanner;
public class stringFunc {
	static Scanner input = new Scanner(System.in);
	
	void replace(String name, String surname) {
		System.out.println("Enter the name want to be replaced: ");
		String rname = input.nextLine();
		name = name.replace(name, rname);
		System.out.println("Your Full name has been changed to: "+name+surname);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your first name: ");
		String name = input.nextLine();
		System.out.println("Enter your Surname: ");
		String surname = input.nextLine();
		//System.out.println(name+" "+surname);
		System.out.println(name.concat(surname));
		System.out.println(name);
		System.out.println(name.charAt(4));
		
		System.out.println(surname.length());
		
		//System.out.println(name.replace("Manoj", "Manoj Kumar"));
		
		System.out.println("Your Full name is: "+name.concat(surname));
		
		stringFunc ReplaceName = new stringFunc();
		ReplaceName.replace(name, surname);
		
		String Fullname = name + surname;
		System.out.println(Fullname.contains("z"));
		
		System.out.println(Fullname.substring(2,6));
		
		System.out.println(Fullname.toUpperCase());
		
		System.out.println(Fullname.toLowerCase());
	}
}
