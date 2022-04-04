package array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,9,7,6,8};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(i==arr[j]) {
				j++;
			}
			else {
				System.out.println("Missing Number: "+i);
			}
		}
	}
}
