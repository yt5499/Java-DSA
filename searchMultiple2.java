	//	find multiple elements location and storing it into the arraylist (where arraylist is passed in recursion function)

package kunal_kushwaha;

import java.util.ArrayList;

public class searchMultiple2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		int[] a = {5,4,2,1,2,6};	//	output should be 2 & 4
		System.out.println(Search(a, 2, 0, li));

	}
	
	static ArrayList<Integer> Search(int[] arr, int target, int index, ArrayList<Integer> list){
		
		if(index==arr.length) {
			return list;
		}
		
		if(target==arr[index]) {
			list.add(index);
		}
		
		return Search(arr, target, index+1, list);
		
	}

}
