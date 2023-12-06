//• Write a Java program to get a collection view of the values contained in this map
package module_1;

import java.util.HashMap;
import java.util.Map;

public class Que77 {
	public static void main(String[] args) {
		
		// Creating HashMap
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// add objects
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "php");
		map.put(4, "ruby");
		map.put(5, "c++");
		
		// Colloction view of the values
		System.out.println("Collection view of the values");
		System.out.println(map.values());
	}
}
