package kunal_kushwaha;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		create an array
		int[] marks = new int[10];
		
//		input elements
		for(int i=0;i<10;i++) {
			System.out.println("Enter Element at position "+(i+1));
			marks[i] = sc.nextInt();
			
		}
//		get string representation of array(marks)
//		for 1d array use Array.toString(arr_name)
		String marks2 = Arrays.toString(marks);
		System.out.println(marks2);
		
		System.out.println("Now let's drop down into 2D array");

		
//		creating multi-dimentional array
		System.out.println("Enter No. of rows you want");
		int r=sc.nextInt();
		
		System.out.println("Enter No. of columns you want");
		int c=sc.nextInt();
		int[][] arr2 = new int[r][c];
//		System.out.println("Enter elements");
		
//		outer for loop for number of rows
		for(int x=0;x<r;x++) {
			
//			inner for loop for number of columns
			for(int y=0;y<c;y++) {
				System.out.println("Enter element at "+(x+1)+" Row and "+(y+1)+" Column");
				arr2[x][y] = sc.nextInt();
			}
		}
		
//		getting string representation of arr2 (converting int array to str for displaying all together)
//		for 2d array use Arrays.deepToString(arr_name)
		String a = Arrays.deepToString(arr2);
		
		System.out.println(a);
				
	}

}