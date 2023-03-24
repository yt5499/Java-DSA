//linked-list

package kunal_kushwaha;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		
//		adding elements into linkedlist by using loop
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		int n = 10;		//number of times loop will run
		int num = 1;		//number to be printed
		while(n>0) {
			l1.add(num);
			num += 2;
			n -= 1;
		}
		
		System.out.println(l1);			//printing list
		
	}

}
