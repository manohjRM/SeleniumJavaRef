package initiated;

public class calc2 {
	static int a = 10;
	
	void addition()
	{
	int b = 3;	
	System.out.println(a+b);
	}
	
	
	void merge()
	{
		String a = "Saathappan";
		String b = "Manoj";
		String c = a.concat(b);
		
		System.out.println(c);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 5;
		int b = 3;
		
		
		calc2 ob = new calc2();
		ob.addition();
		ob.merge();
		
		
	//	System.out.println(a-b);
	//	System.out.println(a*b);
	//	System.out.println(a/b);
	}

}
