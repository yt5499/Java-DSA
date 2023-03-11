package kunal_kushwaha;

//		Searching element in array by using linear search approach using recursion
public class searchinArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(search(a, 8, 0));			//	this will return true as ele 8 is present n array  	

	}
	
	static boolean search(int[] arr, int target, int index) {
		
		if(index==arr.length) {			//	when index goes out of bound this means ele not found
			return false;
		}
		
		return arr[index]==target || search(arr, target, index+1);		//	either one should be correct
	}

}
