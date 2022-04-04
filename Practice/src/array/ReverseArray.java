package array;

public class ReverseArray {
	public static void main(String[] args) {
		int[][] arr1 = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		//System.out.println(Arrays.deepToString(arr1));
		
		for(int i=2;i>=0;i--) {
			for(int j=2;j>=0;j--) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
