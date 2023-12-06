// Write a program to print the factorial of a number by defining a method named 
//'Factorial'. Factorial of any number n is represented by n! 
package module_1;

import java.util.Scanner;

public class Que32 {
	public static void main(String[] args) {
		
		// for User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		long result = factorial(num);
		System.out.println(num + "! = " + result);
	}

	// Method to calculate factorial
	
	static long factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
            return n * factorial(n - 1);
        }
	}
}
