//Write a Java program to associate the specified value with the specified key in a Hash Map.
package module_1;

import java.util.HashMap;

public class Que63 {
	public static void main(String[] args) {
		
		// Creating new hashmap
		HashMap map =  new HashMap();
		
		// adding objects in hashmap
		
		map.put(1, "java");
		map.put(2, "pyton");
		map.put(3, "php");
		map.put(4, "laravel");
		map.put(5, "ruby");
		
		// display map elements
		System.out.println("Key - value pair in map : "+map);
	}
}
