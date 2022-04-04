package array;

public class UpNumPyramid {
	public static void main(String[] args) {
		int s=6;
		for(int i=1;i<=s;i++) {
			int j;
			for(j=s-i;j>=1; j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}	
			System.out.println("");
			
		}
	}
}
