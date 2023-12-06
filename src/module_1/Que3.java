//Write a Java program that takes a year from user and print whether that year is a leap year or not. 
package module_1;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args) {
		// for take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any year :");
		int year = sc.nextInt();
		
		// check year is leap or not 
		
		if(year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
				System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}
