//	find multiple elements location and storing it into the arraylist (where arraylist is created outside function)

package kunal_kushwaha;

import java.util.ArrayList;

public class searchMultiple {

	public static void main(String[] args) {
		
		int[] a = {5,4,2,1,2,6};	//	output should be 2 & 4
		SearchIndex(a, 2, 0);
		System.out.println(list);

	}
	
	static ArrayList<Integer> list = new ArrayList<>();
	static void SearchIndex(int[] arr, int target, int index) {
		
		if(index==arr.length) {
			return;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		SearchIndex(arr, target, index+1);
		
	}

}
