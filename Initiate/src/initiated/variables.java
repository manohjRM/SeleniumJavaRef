package initiated;

public class variables {
	static int num = 5;//static variable
	void vary(){
		int n2 = 10;//local variable
		System.out.println(n2);
	}
	
	public static void main(String[] args) {
		int n3 = 100;//instance variable
		System.out.println(n3);
		variables n = new variables();
		n.vary();
	}
}
