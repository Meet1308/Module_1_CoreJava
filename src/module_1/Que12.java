// Write a Java program to display the system time
package module_1;

import java.time.LocalTime;

public class Que12 {
	public static void main(String[] args) {
		 // Get the current system time
        LocalTime currentTime = LocalTime.now();

        // Display the system time
        System.out.println("Current System Time: " + currentTime);
	}
}
