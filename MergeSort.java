package kunal_kushwaha;

//import java.awt.SecondaryLoop;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		arr=mergeSo(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] mergeSo(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = mergeSo(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSo(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	
//	method to merge all elements which has been divided in above method
	private static int[] merge(int[] f, int[] s){
		int[] mix = new int[f.length + s.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i < f.length && j < s.length) {
			if(f[i] < s[j]) {
				mix[k] = f[i];
				i++;
			}
			else {
				mix[k] = s[j];
				j++;
			}
			k++;
		}
		
//		it may be possible that one of the array can be larger than the other
//		then copy all remaining elements as it is as they will be sorted
		
		while(i < f.length) {
			mix[k] = f[i];
			i++;
			k++;
		}
		
		while(j < s.length) {
			mix[k] = s[j];
			j++;
			k++;
		}
		
		return mix;
	}

}
