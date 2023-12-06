// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass. 
package module_1;

// Create an abstract class  Parent with message method
abstract class Parent{
	
	// create an abstract method message
	
	public abstract void message();
}

// create first child class extends parent class
class A_one extends Parent{

	// override the message method of Parent class	
	@Override
	public void message() {
		
		System.out.println("This is first subclass");
	}
	
}

// create second child class  extends  Parent class
class A_two extends Parent{

	// override the message method of Parent class	
	@Override
	public void message() {
		
		System.out.println("This is second subclass");
	}
	
}
public class Que29 {
	public static void main(String[] args) {
		
		// Create  an Object of First child class
		A_one a1 = new A_one();
		
		// calling first child's overriden method
		a1.message();
		
		// Create  an Object of second child class
		A_two a2 = new A_two();
				
		// calling second child's overriden method
		a2.message();
	}
}
