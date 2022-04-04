package array;

public class Addition {
	public static void main(String[] args) {
		int[][] arr1 = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		
		int[][] arr2 = {
				{2,4,6},{1,3,5},{7,9,11}	
		};
		int[][] arr3 = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
				System.out.printf("%02d ",arr3[i][j]);
			}
			System.out.println("");
	}
}
}
