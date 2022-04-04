package oops;

class SingleParent{
	void display() {
		System.out.println("I am a single parent");
	}
}

public class SingleInheritance extends SingleParent{
	public static void main(String[] args) {
		SingleInheritance ch = new SingleInheritance();
		System.out.println("Calling from child class");
		ch.display();
	}
}
