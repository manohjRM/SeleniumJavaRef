package initiated;

public class methodOverloading {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	int add(int a) {
		int b = 10;
		return a+b;
	}
	
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading call = new methodOverloading();
		call.add(7,8,3);
		call.add(10,20,30);
		System.out.println(call.add(50,60,30,60));
		System.out.println(call.add(10));
	}

}
