package array;

public class LeftDownPyramid {
	public static void main(String[] args) {
		String ast = "*";
		for(int i=1;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print(ast);
			}
			System.out.println("");
		}
	}
}
