//Take two numbers from the user and perform the division operation and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero 

package module_1;

import java.util.Scanner;

public class Que37 {
	public static void main(String[] args) {
		// for user input
		Scanner sc = new Scanner(System.in);
		
		// take  2 numbers from user
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		// if user set 0 as denominator then arithmetic Exception occurs.
		
		try {
			int div = n1 / n2;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
}
