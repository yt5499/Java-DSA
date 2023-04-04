package DSA_revision;

import java.util.Iterator;

public class linearsearch {

	public static void main(String[] args) {
		
		int[] arr = {8,9,5,4,6,2};
		
		int find = ls(arr,1);
		
		System.out.println(find);

	}
	
	static int ls(int[] arr , int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return 1;
	}

}
