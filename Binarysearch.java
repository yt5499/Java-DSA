package kunal_kushwaha;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		
		int eletofind = 1;
		int[] arr = {1,2,3,4};
		
		int bs = bnrs(arr,eletofind);
		System.out.println(bs);
	}
	
//	lets create meathod for binary search
	static int bnrs(int[] a, int target) {
		
		if(a.length == 0) {
			return -1;
		}
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end) {
			int mid = (start + (end - start))/2;

			if(target<a[mid]) {
				end=mid-1;
			}
			else if (target>a[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
	
	
}
		

	
	
			

