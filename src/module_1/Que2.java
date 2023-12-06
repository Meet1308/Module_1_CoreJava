//  Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input
package module_1;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		// for take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character :");
		
        String input = sc.next();

        // Check if the input is a single character
        if (input.length() == 1) {
        	char ch = input.charAt(0);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Convert the character to lowercase 
                char lowercaseCh = Character.toLowerCase(ch);

                // Check if the character is a vowel
                if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' ||
                    lowercaseCh == 'o' || lowercaseCh == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                // If the character is not a letter
                System.out.println("Error: Not a letter.");
            }
        } else {
            // If the input is not a single character
            System.out.println("Error: Please enter a single character.");
        }

	}
}
