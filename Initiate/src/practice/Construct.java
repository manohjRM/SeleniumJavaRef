package practice;

import java.util.Scanner;

class Member{
	
	private static int count = 0;
	private int id;
	String name;
	int age;
	Member(){
		setId(count);
		count++;
		System.out.println("Member "+id+" created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	void setName(String Name) {
		this.name = Name;
	}
	String getName() {
		return name;
	}
	void setage(int Age) {
		this.age = Age;
	}
	int getage() {
		return age;
	}
	
	void details() {
		System.out.println(name+", age of "+age+" added under the member id "+id);
	}
}

public class Construct {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		
		System.out.println("Enter the name: ");
		m1.setName(input.nextLine());
		System.out.println("Enter the age: ");
		m1.setage(input.nextInt());
		
		System.out.println("Enter the name: ");
		m2.setName(input.nextLine());
		System.out.println("Enter the age: ");
		m2.setage(input.nextInt());
		
		m1.details();
		m2.details();
	}
	
}
