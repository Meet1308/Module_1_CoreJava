// Write a Java program to retrieve an element (at a specified index) from a given array list. 
package module_1;

import java.util.ArrayList;

public class Que53 {
	public static void main(String[] args) {
		
		//  Creating new ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		// add elements in ArrayList
		list.add("Java");
		list.add("python");
		list.add("php");
		list.add("Kotlin");
		list.add("JavaScript");
		
		// display ArrayList
		System.out.println(list);
		
		// retrieve an element at specific index by get() method.
		System.out.println(list.get(0));
	}
}
