package array;

public class LeftUpPyramid {
	public static void main(String[] args) {
		String ast = "*";
		int s=7;
		for(int i=1;i<s;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ast);
			}	
			System.out.println("");
		}
	}
}
