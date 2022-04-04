package initiated;

import java.util.*;

public class array {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int[] values;
	values = new int[10];
	
	int a = 1;
	
	System.out.println("Enter the values:");
	
	for(int i =0;i<values.length;i++) {
		a = a+(2^i);
		//System.out.println(a+" "+i);
		values[i] = a;
	}
	
	for(int i =0;i<values.length;i++) {
		System.out.printf("%02d ",values[i]);
	}
	
	String[] s = {"Manoj","kumar","Rengasamy","Manian"};
	for(String name: s) {
		System.out.printf("\n%-15s ",name);
	}
}
}
