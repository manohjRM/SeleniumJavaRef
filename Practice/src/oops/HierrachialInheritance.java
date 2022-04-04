package oops;

class HParent{
	void display() {
		System.out.println(getClass()+" - I am a single parent, having more than one child");
	}
	void ClassName() {
		System.out.println(getClass());
	}
}

class Child1 extends HParent{
	void display1() {
		System.out.println("I am "+getClass()+", child of parent: HParent");
	}
}
class Child2 extends HParent{
	void display2() {
		System.out.println("I am "+getClass()+", child of parent: HParent");
	}
}
public class HierrachialInheritance extends HParent {
	public static void main(String[] args) {
		HierrachialInheritance ob1 = new HierrachialInheritance();
		ob1.display();
		Child1 ob2 = new Child1();
		ob2.display1();
		Child2 ob3 = new Child2();
		ob3.display2();
	}
}
