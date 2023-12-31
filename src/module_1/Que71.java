// Write a Java program to convert a hash set to a List/Array List. 
package module_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Que71 {
	public static void main(String[] args) {
		
		// Create a new HashSet
		HashSet set = new HashSet();
		
		// add objects in hashset
		set.add(1);
		set.add("meet");
		set.add(true);
		set.add('y');
		set.add(12.5632);
		
		// display objects 
		System.out.println("HashSet : "+set);
		
		//   Create a List from HashSet elements
		List list = new ArrayList(set);
		
		// Display ArrayList elements
	     System.out.println("ArrayList: "+ list);
	}
}
