//• Write a program in Java to display the pattern
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
package module_1;

public class Que6 {
	public static void main(String[] args) {
		// 2 for loops one for row and second for cols and repitition of col so 
		// print colums.
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
}
