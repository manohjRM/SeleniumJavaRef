package array;

public class MultiplicationArray {
	public static void main(String[] args) {
		int[][] arr1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2 = {
				{2,4,6},
				{1,3,5},
				{7,9,11}	
		};
		int[][] arr3 = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j] = 0;
				for(int k=0;k<3;k++) {
					arr3[i][j] += arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
