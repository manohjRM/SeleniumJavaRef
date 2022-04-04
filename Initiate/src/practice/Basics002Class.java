package practice;

import java.util.*;

class Person{
	Scanner input = new Scanner(System.in);
	String name;
	int age;
	String career;
	
	
	String setname(String Name) {
		this.name = Name;
		return name;
	}
	
	String setcareer(String Career) {
		this.career = Career;
		return career;
	}
	
	void job(int age) {
		this.age = age;
	}
	
}

public class Basics002Class {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Person p1 = new Person();
		String Name = p1.setname(input.nextLine());
		String Career = p1.setcareer( input.nextLine());
		
		System.out.println(Name+" is a "+Career);
	}
}
