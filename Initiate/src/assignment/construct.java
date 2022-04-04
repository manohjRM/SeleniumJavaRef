package assignment;

public class construct {
	static double c = 3.14;
	construct(int x, int m){
		double y = m*x + c;
		System.out.println(y);
	}
	String print() {
		String m= "Line";
		System.out.println("This is a line");
		return m;
	}
	
	public static void main(String[] args) {
		construct obj1 = new construct(5,9);
		
		System.out.println(obj1.print());
	}
}
