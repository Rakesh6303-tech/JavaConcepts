package oops;
/*
 * Encapsulation is the Process of Providing Security & Controlled axcess to the most Important of an object.
 * --> By using "Private" we can Provide Security.
 * --> By using "public setter & public getter we can provide Controlled
 * --> Getters (Accessors) & Setters(Mutators) are Two Conventional Methods Which are used inside a class for Updating & Reterving 
 * --> Shadowing Problem--> There is a Name clash Between Instance Varaible & Local Varaible. so we have to avoid that problem we use "this" keyword.
 * --> Real Time Example--> Bank Account bal when it is in public, anyone can axcess that Bal.
 * ---> So we Declare it as a Private , No one can axcess that bank bal
 * 
 * <------ Advantages ----->
 * -----> Code Security
 * ----->Maintainbility
 * 
 *  */
import java.util.*;
class BankAccount{
	private int ba;  //  set as a private
	public void setdata(int ba)  // set method
	{
		if(ba>=0)     // checking the condition
		{
			this.ba=ba; // for avoding the shadowing problem
		}
		else {
			System.out.print("Invalid Input");
			System.exit(0);
		}
	}
	public int getData()  // reterving the data by using get method
	{
		return ba;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(); // Create an object
		ba.setdata(1000);   // set the data by using setters
		System.out.print(ba.getData());    // getting or reterving the data
	}
}
