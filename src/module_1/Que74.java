//W.A.J.P to replace the second element of an Array List with the specified element. 
package module_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que74 {
	public static void main(String[] args) {
		
		// Creating a new ArrayList
		List list = new ArrayList();
		
		// add elements
		list.add("Tometo");
		list.add("Poteto");
		list.add("Bringle");
		
		// print list
		System.out.println("before replace : "+list);
		
		// replace
		list.set(1, "Cabbage");
		
		
		Iterator itr = list.iterator();
		
		System.out.println();
		System.out.println("after replace : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
