package array;

public class UpPyramid {
	public static void main(String[] args) {
		String ast = "*";
		int s=6;
		for(int i=0;i<=s;i++) {
			int j;
			for(j=s-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++ ) {
				System.out.print(ast+" ");
			}	
			System.out.println("");
			
		}
	}
}
