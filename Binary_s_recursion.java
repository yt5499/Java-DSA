package kunal_kushwaha;

public class Binary_s_recursion {

	public static void main(String[] args) {
		
		int[] store = {7,8,5,4,2,1,3,6,9,11};
		int ele_to_find = 2;
		int s = 0;
		int e = store.length-1;
		
		int bs = bsur(store,ele_to_find,s,e);
		System.out.println(bs);
		
	}
	
	
//	Binary search using recursion(bsur)
	static int bsur(int[] arr,int target,int start,int end) {
		
		if(start>end) {
			return -1;
		}
		
		int mid = start + (end - start)/2;
		
		if (arr[mid]==target) {
			return mid;
		}
		
		if (target<arr[mid]) {
			return bsur(arr,target,start,mid-1);
		}
		return bsur(arr,target,mid+1,end);
		
	}

}
