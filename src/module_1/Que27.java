// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor. 
package module_1;

// create a class Triangle
class Triangle{
	
	// create a constructor without perameters
	public Triangle() {
		int a = 3, b = 4, c = 5;
		int perimeter = a+b+c;
		System.out.println("Perimeter of Triangle : "+perimeter);
	}
}
public class Que27 {
	public static void main(String[] args) {
		
		// create an object of Triangle
		Triangle obj = new Triangle();
	}
}
