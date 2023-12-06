//Write a Java program to append the specified element to the end of a hash set. 
package module_1;

import java.util.HashSet;
import java.util.Set;

public class Que60 {
	public static void main(String[] args) {
		
		// Creating new Hashset
		Set<String> set = new HashSet<String>();
		
		// add objects in Hashset
		set.add("java");
		set.add("php");
		set.add("python");
		set.add("kotlin");
		set.add("ruby");
		
		// printing objects
		System.out.println("Original Hashset : "+ set);
		
		// add new object in exist set
		set.add("c++");
		
		System.out.println("After add new element : "+set);
	}
}
