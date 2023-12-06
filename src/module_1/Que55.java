//Write a Java program to remove the third element from an array list. 
package module_1;

import java.util.ArrayList;
import java.util.List;

public class Que55 {
	public static void main(String[] args) {
		
		// Creating new ArrayList
		List list = new ArrayList();
		
		// add elements in arrayList
		list.add("java");
		list.add(2);
		list.add(true);
		list.add('m');
		list.add(12.565656556);
		
		// printing an arraylist
		System.out.println(list);
		
		// remove the third element of list
		list.remove(2);
		System.out.println(list);
	}
}
