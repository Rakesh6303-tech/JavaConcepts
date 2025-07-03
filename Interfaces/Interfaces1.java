package oops;
/*
 * Interfaces Can Have Pure Abstract Methods 
 * Interfaces can be done by using ----> implements Keyword
 * 
 * Before java 8  version we dont have method bodies inside interface
 * from java 8 we have static and default method bodies
 * from java 9 Introduced Private Methods
 * 
 * functional Interface :- can contain only One Abstract method is called FI
 * There are 4 ways to implement Functional Interface
 * 1)Outer Class
 * 2)Inner Class
 * 3)Annonymous Inner Class
 * 4)Lamda Expression
 * 
 * Rules of Interfaces:
 * 1)Interface is like a contract which when implemented helps to achevie Standarzation
 * 2)Interface Promotos Polymorphism
 * 3)Methods Within Interface Default Public, Abstract
 * 4)By using Interface Type Reference we cant axcess Specialized Method
 * 5)If a class is partially implements interface we must declare itself as a abstract
 * 6)A class can implement Multiple Interface
 * 7)An interface can Implements Multiple Interface
 * 8)An Interface can extend Another Interface
 * 9)A class can both extend as well as implements an interface. But the order should be 1) Extends and 2) Implements
 * 10)An Empty Interface in java refers to Marker Interface it doesn't have any thing
 * 11)An Interfaces contain constant variables & method signature

 * Difference Between Interfaces and Abstraction
 *  Interfaces hace  pure abstract  methods, while Abstraction have anstract methods as well as concerete methods
 *  Interfaces Dont  have constructors while, Abstraction have constructors
 */
import java.util.*;

interface calculator{
	void add();
	void sub();
}
class MyCalculator11 implements calculator
{
	@Override
	public void add()
	{
		int a = 200;
		int b = 100;
		System.out.println(a+b);
		
	}
	@Override
	public void sub()
	{
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}
}
class Mycalculator22 implements calculator
{
	@Override
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		System.out.println(m+n);
	}
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		System.out.println(m-n);
	}
}
class Mycalculator33 implements calculator
{
	@Override
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		if(m==0 || n==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(m+n);
		}
	}
	@Override
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		if(m==0 || n==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(m-n);
		
	}
}

public class Interfaces {

	public static void main(String[] args) {
		MyCalculator11 c1 = new MyCalculator11();
		Mycalculator22 c2 = new Mycalculator22();
		Mycalculator33 c3 = new Mycalculator33();
		
		c1.add();
		c1.sub();
		
		c2.add();
		c2.sub();
		c3.add();
		c3.sub();
		
		
//		calculator c;
//		
		
	}
	}
}
