package oops;

class Parent{
	void displayParent() {
		System.out.println("I am in Parent Class");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("I am in Child Class");
	}
}
public class MultiLevelInheritance extends Child{
	public static void main(String[] args)  {
		MultiLevelInheritance ob1 = new MultiLevelInheritance();
		ob1.display();
		ob1.displayParent();
		
		Child ob2 = new Child();
		ob2.displayParent();
	}
}
