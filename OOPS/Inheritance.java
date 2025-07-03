package oops;
import java.util.*;
/*
 *  Inheritance is a Process of Acquring the Properties and Behaviour from one class to another class
 *  Inheritance can be done by using "extends" Keyword
 *  Types of Inheritance
 *  1)single Level Inheritance
 *  2)Multi Level Inheritance
 *  3 hyberid 
 *  4)Hierarichal Inheritance  <--Only 4 are useful-->
 *  
 *  5)multiple Inheritance  
 *  6)Acyclic Inheritance
 *  
 *  Types of Methods in Inheritance
 *  1) Inherited Method
 *  2)Override Method
 *  3)Specialzed Method
 */

class Parents{
	void Height() // Inherted to child class
	{ 
		System.out.println("Height is occupied");
	}
	void Skin_Color() // Inherted to child class
	{
		System.out.println("skincolor is occupied");
	}
	void Hair_color()
	{
		System.out.println("Haircolor is occupied");
	}
	void Nose()
	{
		System.out.println("Nose is occupied");
	}
}

class Child extends Parents    // Height & Skin_color is Inherited
{
	@Override
	void Hair_color()
	{
		System.out.println("Stylish Hair Style");
	}
	@Override
	void Nose()
	{
		System.out.println("Nose is Different");
	}
	void swim()  // Specialized method
	{
		System.out.println("Child know Swimming");
	}
	void guitar() // Specialized method
	{
		System.out.println("Child Plays Guitar");
	}	
}

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.Height();
		c.Skin_Color();
		c.Hair_color();
		c.Nose();
		c.swim();
		c.guitar();
		

	}

}
