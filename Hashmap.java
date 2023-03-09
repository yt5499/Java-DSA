package myproject1;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create hash map
		Map<String,Integer> hmap= new HashMap();
		
//		inserting key-value pairs in hashmap
		hmap.put("India", 14);
		hmap.put("China", 16);
		hmap.put("US", 3);
		hmap.put("UK", 5);
		
//		display the hmap
		System.out.println(hmap);
		
//		Altering
		hmap.put("US", 4);
		System.out.println(hmap);
		
//		searching key
//		1st
		if(hmap.containsKey("India")) {
			System.out.println("Key Present");
		}
		else {
			System.out.println("Key not present");
		}
//		2nd
		if(hmap.containsKey("Srilanka")) {
			System.out.println("Key Present");
		}
		else {
			System.out.println("Key not present");
		}
		
//		searching value
		System.out.println(hmap.get("India"));
		
//		iterating values
		for(Map.Entry<String,Integer>entry:hmap.entrySet()){
			System.out.println(entry.getKey() + "=" + entry.getValue() + "B");
		}
		
//		removing pair
		hmap.remove("China");
		System.out.println(hmap);
		

	}

}
//Thank You
