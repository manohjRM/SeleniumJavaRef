package initiated;

class testme1{
	int c = 10;
	testme1() {
		System.out.println("testme");
		//int c;
		System.out.println(c);
	}
	testme1(int a){	
		this();
		System.out.println(a);
		int c;
	}
	testme1(String n){
		this();
		System.out.println(n);
		int c;
	}
}

public class amstrong {
	public static void main(String[] args) {
		testme1 obj1 = new testme1("hello");
		int c;
	}
}
