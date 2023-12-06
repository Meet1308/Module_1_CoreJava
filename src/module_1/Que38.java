//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle 
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 
package module_1;

import java.util.Scanner;

public class Que38 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// take an array size
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		
		// take an array and give it size
		int[] a = new int[size];
		
		// take elements
		for(int index=0; index<a.length; index++) {
			
			System.out.print("Enter element ar arr["+index+"] index :");
			a[index] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println(a[4]);
		
		
		// try - catch for exception handling
		try {
			System.out.println(a[4]/0);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
