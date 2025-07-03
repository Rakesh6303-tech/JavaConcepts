package program;
/*
 * MethodOVerLoading  or Compile Time Polymorphism or Static Binding Or Early Binding
 *     is a Process of Creating multiple Methods Inside a Same Class with Same Method name With Different Parameters
 *  
 *  <----There Are 3 Ways to Acheive MOL---->
 *   Number of Parameters
 *   Order of Parameters
 *   DataType of Parameters
 *   
 * <-----Interview Question--->
 *   
 *    When To Use Method Overloading?
 *      When You Want To Perform Same Action in different ways with Input Then We use MOL.
 *      
 *    Why We Use Method Overloading?
 *    To Increase The readiblity and Resuability of code. It allows the same method to Handle Differnt Types or Numbers of Arguments
 *    
 *    Can Method Has Same return type?
 *    Yes 
 *   
 *   
 *   
 */
import java.util.*;
class Calculator{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
	double add(double a, double b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();        // Creating the Object 
		System.out.println(c.add(10,40));    // Calls The First Method
		System.out.println(c.add(40, 85,20));  // Calls The Second Method
		System.out.println(c.add(22.5, 15.0));  // Calls The Third Method
		 
		
	}

}
