package collections;

import java.util.*;

public class Linkedlist {
	public static void main(String[] args) {
		List<Integer> linklist = new LinkedList<Integer>();
		
		for(int i=0;i<1E5;i++) {
			linklist.add(i);
			System.out.println(i);
		}
		
		//System.out.println(linklist);
	}
}
