//Create a class with a method that prints "This is a parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of 
//the class and call 1 - method of parent class by object of parent class 2 - method of 
//child class by object of child class 3 - method of parent class by object of child class 
package module_1;

// create parent class
class  Parent_Class{
	
	public void parent() {
		System.out.println("This is a parent class.");
	}
}
// create child class which access properties  of parent class

class Child_Class extends Parent_Class{
	
	public void child() {
		System.out.println("This is child class.");
	}
}
public class Que24 {
	public static void main(String[] args) {
		
		// Create object of Parent Class
		Parent_Class po = new Parent_Class();
		
		// Create object of Child  Class
		Child_Class  co = new Child_Class();
		
		// call parent class method using parent class object
		po.parent();
		
		// call child class method using child class object
		co.child();
		
		// call parent class method using child class object
		co.parent();
		
	}
}
