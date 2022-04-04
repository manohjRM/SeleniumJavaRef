package array;

public class RightDownNumPyramid {
	public static void main(String[] args) {
		int s=6;
		for(int i=1;i<=s;i++) {
			int j,n=1;
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(j=s-i;j>=1;j--) {
				System.out.print(n);
				n++;
			}
				
			System.out.println("");
			
		}
	}
}
