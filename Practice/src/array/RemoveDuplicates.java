package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,1,23,9,5,79,12,32,4,32,3,2};
		Set<Integer> a1 = new HashSet<>(Arrays.asList(arr));
		System.out.println("Length of the array: "+arr.length);
		System.out.println(a1);
		System.out.println("Length of the set: "+a1.size());
	}
}
