package myproject1;
import java.util.*;

public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creating a map for storing employee and his information
		Map<String, String> employee = new HashMap();
		
//		inserting values
		employee.put("Ashish","Employee at Indian oil");
		employee.put("Suraj","Employee at Bharat Benz");
		employee.put("Ankit","Employee at Enkinlabs pvt ltd");
		employee.put("Rahul","Employee at TCS");
		employee.put("Varun","Employee at Indian Railway");
		
		
//		now itterating through map
		for(Map.Entry<String, String> entry : employee.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		/*var e=employee.entrySet();
		for(var entry: e) {
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}*/
		
		

	}

}
