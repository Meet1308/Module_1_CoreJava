//• W.a.j.p input 5 numbers from keyboard and find their sum and average using for loop. 
package module_1;

import java.util.Scanner;

public class Que5 {
	public static void main(String[] args) {
		
		// for user input 
		Scanner sc = new Scanner(System.in);
		
		// take 5 numbers from user in array
		System.out.println("Enter five numbers :");
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		// find sum of 5 elements
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum : "+sum);
		
		// find average of 5 elements
		double avg = sum/5;
		System.out.println("Average : "+avg);
	}
}
