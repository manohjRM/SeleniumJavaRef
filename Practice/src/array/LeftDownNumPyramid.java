package array;

public class LeftDownNumPyramid {
	public static void main(String[] args) {
		String ast = "*";
		for(int i=1;i<=6;i++) {
			int n=1;
			for(int j=6;j>=i;j--) {
				System.out.print(n);
				n++;
			}
			System.out.println("");
		}
	}
}
