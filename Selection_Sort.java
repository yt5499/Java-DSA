package kunal_kushwaha;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int[] ssrt = {8,5,6,9,7,1,8,3,6,4,9};
		System.out.println("Before Sort: "+Arrays.toString(ssrt));
		selectsort(ssrt);
		System.out.println("After Sort: "+Arrays.toString(ssrt));

	}
	
//	function for selection sort
	static void selectsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int end = arr.length-1-i;
			int maxI = getMaxIndex(arr, 0, end);
			swap(arr, maxI, end);
		}
		
	}
	
//	function for finding max element in array
	static int getMaxIndex(int[] arr,int start,int end) {
		
		int max = start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
		}
		return max;
	}
	
//	function for swapping
	static void swap(int[] arr,int max,int end) {
		int temp = arr[max];
		arr[max]= arr[end];
		arr[end] = temp;
		
	}

}
