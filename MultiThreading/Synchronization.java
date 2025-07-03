package oops;

/*
 * Synchronization is a locking System in Java Which is achieved with the help of 
 * ---> synchronized keyword where in one Thread can axcess at any Resource(Method) any part of Time
 * ----> Without synchronized keyword all are Entering at once time, using, existed
 * Here an Example for the synchronized keyword 
 * ----> Bathroom(Resource) are using Boy, Girl, Others.
 * ----> Entering one after one of their completion of their work
 * ----> Lock and unlock will be happened using synchronized keyword
 * -----> Thread Schedular will tell Who will entire & exit
 * 
 */
import java.util.*;
class Bathroom{
	synchronized void Bathroom()  // it used for locking system who inside it will be lock, after unlock automatically
	{                            // After Completion of using Bathroom Unlock be happen Automatically
		                
		try {
			System.out.println(Thread.currentThread().getName()+" has Entered into the Bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the Bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" has Exited from Bathroom");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Boy extends Thread
{
	
	public void run()
	{
		ba.Bathroom();   // Started Bathroom USing bcz boy can get the bathroom using ba
	}
	
	Bathroom ba;     // Object with Refernce
	Boy(Bathroom ba)  //  Created Parameterized Constructor  & class name Must be same
	{
		this.ba=ba; // Instance variable of ref Bathroom
	}
}
class Girl extends Thread
{
	
	public void run()
	{
		ba.Bathroom();  // Started Bathroom USing
	}
	Bathroom ba;     //   Object with Refernce
	Girl(Bathroom ba)  // Parameterized Constructor
	{
		this.ba=ba; // Instance variable of ref Bathroom
	}
}
class Others extends Thread
{
	
	public void run()
	{
		ba.Bathroom();  // Started Bathroom USing
	}
	Bathroom ba;     // Instance varaible Created
	Others(Bathroom ba)  // Parameterized Constructor
	{
		this.ba=ba; // Instance variable of ref Bathroom
	}
}
public class Synchronized {

	public static void main(String[] args) {
		
		Bathroom ba = new Bathroom();
		
		Boy b = new Boy(ba);  // Default Name has Thread 
		
		Girl g = new Girl(ba);
		
		Others o = new Others(ba);
		
		b.setName("BOY");  // we seted as name to Threads like BOY
		g.setName("GIRL");  // we seted as name to Threads like GIRL
		o.setName("OTHERS");  // we seted as name to Threads like OTHERS
		
			b.start();
			g.start();
			o.start();
//			try {
		//	b.join();  // In this we are telling who are entering
			
		//	g.join();
			
		//	o.join();
		//}
	//	catch(Exception e)
	//	{
	//		e.printStackTrace();
	//	}

	}

}
