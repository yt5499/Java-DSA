package kunal_kushwaha;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a = {5,4,3,2,1};
		quickSort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));

	}
	
	static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int start = low;
		int end = high;
		int mid = start + (end - start)/2;
		int pivot = arr[mid];
		
		while(start <= end) {
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
		}
		
//		now my pivot is at correct index, please sort two values now
		quickSort(arr, low, start);
		quickSort(arr, start, high);
		
	}

}
