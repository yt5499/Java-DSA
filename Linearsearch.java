package kunal_kushwaha;

public class Linearsearch {

	public static void main(String[] args) {
		
		int[] li = {5,8,9,4,6,3,7,54};
		
		
		int tof = 9;
		int ff = lnrs(li, tof);
		System.out.println(ff);
		
	}
	
	
//	method for linear search
	public static int lnrs(int[] arr, int target) {
		
//		if the array is empty
		if(arr.length == 0) {
//			System.out.println("Array is empty");
			return -2;
		}
		
//		loop for passes
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
//				System.out.println("Element found at location "+(i+1)+" and the element is "+arr[i]);
				return i+1;
			}
		}
		
//		System.out.println("Element not Found!!!");
		return -1;
	}
	
}
