package practice;

public class ConcatString {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "PQR";
		
		String s4 = s1.concat(s2.concat(s3));
		
		System.out.println(s4);
		
	}
}
