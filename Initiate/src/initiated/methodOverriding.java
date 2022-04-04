package initiated;

class cal{
	int sum(int a, int b) {
		return a+b;
	}
}

class cal2{
	int sum(int a, int b) {
		return a+b;
	}
}

public class methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal m = new cal();
		cal2 n = new cal2();
		System.out.println(m.sum(10, 20));
		System.out.println(n.sum(50, 30));
	}

}
