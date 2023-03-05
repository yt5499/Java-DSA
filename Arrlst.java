package kunal_kushwaha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrlst {

	public static void main(String[] args) {
		
//		lets learn to create arraylist

		/*
//		1d arraylist
		ArrayList<Integer> l1 = new ArrayList<>();
		
//		giving input
		for (int i=0;i<=100;i++) {
			l1.add(i+5);
		}
		
		System.out.println(l1);
		System.out.println(l1.remove(3));
		System.out.println(l1);
		
//		lets create arraylist of string
		ArrayList<String> l2 = new ArrayList<>();
		
		l2.add("Yash");
		l2.add("Thakur");
		l2.add("Rajiv");
		
		System.out.println(l2);
		l2.remove(2);
		System.out.println(l2);
		
//		Giving direct inputs in 1d arraylists
 		
 		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(8,9,5,4,6,5,48,7));
		System.out.println("Here is your array list: "+a);
		*/
		
//		let's create 2d arraylist
//		ArrayList<ArrayList<Integer>> li3 = new ArrayList<>();
//		ArrayList<ArrayList<Integer>> li = new ArrayList<>();
		
		ArrayList<Integer>[][] li5 = new ArrayList[3][3];
		
//		input elements
		li5[0][0] = new ArrayList<Integer>();
	      
        li5[0][0].add(7);
        li5[0][0].add(8);
        li5[0][0].add(9);

        li5[0][1] = new ArrayList<Integer>();
        li5[0][1].add(4);
        li5[0][1].add(5);
        li5[0][1].add(6);

        li5[0][2] = new ArrayList<Integer >();
        li5[0][2].add(1);
        li5[0][2].add(2);
        li5[0][2].add(3);
        
        li5[1][0] = new ArrayList<Integer>();
        li5[1][0].add(99);
//        li5[1][0].add(100);
        
		
		System.out.println(Arrays.deepToString(li5));
		
		
//		giving input for two dimentional arraylist
//		li3.add(Arrays.asList(7,8,9));
//		String[] li4 = {"7 8 9","4 5 6","1 2 3"};
		
//		printing arraylist

		
		
	}

}
