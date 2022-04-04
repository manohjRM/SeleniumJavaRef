package initiated;

public class operators {
	void unary(int a) {
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
	}
	void shift(int a) {
		System.out.println(a<<2);
		//System.out.println(a*(2^2));
		System.out.println(a>>2);
		//System.out.println(a/(2^2));
	}
	void ternary() {
		int a = 10;
		int b = 20;
		int result1 = a<b?a:b;
		int result2 = a>b?a:b;
		System.out.println(result1);
		System.out.println(result2);
	}
	public static void main(String[] args) {
		int a = 4;
		operators var = new operators();
		//var.unary(a);
		//var.shift(a);
		var.ternary();
	}
}
