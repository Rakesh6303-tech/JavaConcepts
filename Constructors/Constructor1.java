package oops;
import java.util.*;
/*
 * Constructors are Specialzed type of sector whose name is  same as a class name
 * It doesnt have return type
 * Constructor are divided into 3 types 
 * 1) Parameterized 
 * 2)Zero Parameterized
   3) Default Constructor
 * If user doesnt provide any constructor The Java Compiler provide Default constructor(zero para)
  Constructor overloading : Creating multiple constructors within in same class is know as constructor overloding. But constructors have different parameters like method overloading
  constructor chaining : is a process where one constructor calls another constructor is known as CC with in same Class is called Constructor Chanining.
  There are Two Ways to Acheive Constructor Chanining
   1) Within Same Class
   2) child class to parent class
   Local Chaining : if constrctor calls another constructor within same class we can use this()
   Super() : if constrctor calls another constructor which is present in different class then we use super()       
   Can we make Constructors as Private ? Yes we can 
 * 
 */
class customer{  // class name must same of the customer name
	private int cid;
	private String cname;
	private long cnum;
	
	public  customer(int cid,String cname,long cnum) // Created Parameterized Constructor & name has must same of class
	{
		this.cid=cid;    // To avoid the Shadowing Problem
		this.cname=cname;
		this.cnum=cnum;
	}
	public int getcid()   // Get Methods
	{
		return cid;
	}
	public String getcname() {
		return cname;
	}
	public long getcnum()
	{
		return cnum;
	}
}
public class Constructor {
	public static void main(String[] args) {
	customer c = new customer(1,"developer",586978678L);  // Passing the values to the custome object
	System.out.println(c.getcid());                       // one by one method will calling
	System.out.println(c.getcname());                    
	System.out.println(c.getcnum());

	}

}
