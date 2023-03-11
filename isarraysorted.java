package kunal_kushwaha;

//	here we are going to check wheather array is sorted or not(boolean) by using "Recursion"

public class isarraysorted {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,88,9};				//	this will give false
		System.out.println(sortornot(a, 0));

	}
	
	static boolean sortornot(int[] arr, int index) {
		
//		base condition
		if(index==arr.length-1) {
			return true;
		}
		
		return arr[index]<arr[index+1] && sortornot(arr, index+1);
		
	}

}
