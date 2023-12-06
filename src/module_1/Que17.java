// W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
package module_1;

public class Que17 {
	public static void main(String[] args) {
		
		// Given Strings
		String s1 = "Java Excercises";
		
		//check String ends with se 
		System.out.println(s1.endsWith("se"));
		
		String s2 = "Java Excercise";
		
		//check String ends with se 
		System.out.println(s2.endsWith("se"));
	}
}
