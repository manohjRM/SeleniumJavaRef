package oops;

class CPolyClass{
	void display(int a, int b, int c) {
		System.out.println("Addition of numbers: "+(a+b+c));
	}
	void display(int a, int b) {
		System.out.println("Subtraction of numbers: "+(a-b));
	}
	void display(String sh) {
		System.out.println(sh);
	}
	void display() {
		System.out.println("Empty method");
	}
	void display(int a, String n) {
		for(int i =0;i<a;i++) {
			System.out.printf("%d-%s ",i,n);
		}
	}
}

public class CompileTimePoly {
	public static void main(String[] args) {
		CPolyClass ob1 = new CPolyClass();
		System.out.println("Same method name with different number of arguments and different types of arguments");
		ob1.display(2, 3);
		ob1.display(5, 6, 8);
		ob1.display("Say Hello!");
		ob1.display();
		ob1.display(4, "Object");
	}
}
