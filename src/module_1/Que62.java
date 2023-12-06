//Write a Java program to get the number of elements in a hash set. 
package module_1;

import java.util.HashSet;

public class Que62 {
	public static void main(String[] args) {
		
		// Creating new Hashset
		HashSet<String> set = new HashSet<String>();
		
		// add objects in set
		set.add("meet");
		set.add("raj");
		set.add("ajay");
		set.add("jay");
		set.add("ravi");
		
		// displaying elements
		System.out.println("Original hashset : "+set);
		
		// size of hashset
		System.out.println("Size of Hashset : "+set.size());
	}
}
