package practice;

public class Split {

	public static void main(String[] args) {
		String s1 = "Java,Selenium,TestNG,Maven";
		
		String[] s2 = s1.split(",");
		
		for(String s: s2) {
			System.out.println(s);
		}
	}
}
