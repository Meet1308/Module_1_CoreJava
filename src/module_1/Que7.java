//• Write a program in Java to display the pattern
//1 
//2 3 
//4 5 6 
//7 8 9 10 
package module_1;

public class Que7 {
	public static void main(String[] args) {
		// take a var for increment of numbers by one.
		int k = 1;
		
		// for  print pattern using for loop here
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}