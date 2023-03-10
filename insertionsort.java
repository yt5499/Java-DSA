package kunal_kushwaha;

import java.util.Arrays;

public class insertionsort {

	public static void main(String[] args) {
		int[] arr = {8,9,7,4,8,5,3,1,6,4,2};
		
		inss(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	static void inss(int[] arr) {
//		outerloop 
		for(int i=0;i<arr.length-1;i++) {
//		innerloop will run from i+1 position till 1st position 
			for(int j=i+1;j>0;j--){
				
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
		
	}
	
	static void swap(int[] arr, int sm, int lg) {
		int temp=arr[sm];
		arr[sm]=arr[lg];
		arr[lg]=temp;
	}

}
