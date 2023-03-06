package kunal_kushwaha;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] a = {8,7,9,4,5,1,6,3};
		
//		calling function
//		System.out.println(bubs(a));
		bubs(a);
//		now print the array
		System.out.println(Arrays.toString(a));

	}
	
	static void bubs(int[] arr) {
		
		boolean swapped;				//if the elements are already swapped
//		outer loop
		for(int i=0;i<arr.length;i++) {
			swapped = false;			//first it will be initialized to false
//			inner loop
			for(int j=1;j<arr.length-i;j++) {			//in first pass largest ele will be at last
//				swapping
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					swapped = true;		//if there's no swap, swapped will remain false
				}
			}
			if(!swapped) {				//and then it will break outer for loop
				break;
			}
		}
		
		
	}

}
