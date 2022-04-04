package initiated;

import java.util.*;

class teacher{
	
	
	teacher(String name, int age, int birthyear){
		String t_name = name;
		int t_age = age;
		System.out.println("Birth year is "+birthyear);
	}
	
	void job() {
		
		//System.out.printf("%s is a Teacher and %d years old",t_name,age);
	}
}

class fighter{
	String name;
	int age;
	int birthyear;
	
	fighter(){
		super();
	}
	
	void job() {
		System.out.printf("%s is a Fighter and %d years old who born in the year %d",name,age,birthyear);
	}
}

public class Person {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		int age = input.nextInt();
		int birthyear = input.nextInt();
		
		teacher person1 = new teacher(name,age,birthyear);
		
		person1.job();
	}
}
