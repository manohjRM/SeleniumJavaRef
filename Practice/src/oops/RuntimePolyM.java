package oops;

class PolyClass1{
	void display(int a, int b) {
		System.out.println("Addition of two numbers: "+(a+b));
	}
}

class PolyClass2 extends PolyClass1{
	void display(int a, int b) {
		System.out.println("Subtraction of two numbers: "+(a-b));
	}
}

public class RuntimePolyM {
	public static void main(String[] args) {
		PolyClass1 ob1 = new PolyClass2();
		System.out.println("Same method name with different class name passing arguments");
		ob1.display(6, 2);
		PolyClass1 ob2 = new PolyClass1();
		ob2.display(8, 9);
	}
}
