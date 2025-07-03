package oops;
/*
 * Program ----> Set of Instructions are present in HardDisk.
 * Process ----> Set of Instructions are Execting in the Ram.
 * Thread  ----> A Thread is a Independent Instruction which are Excute Independtly, Present in Process Itself.
 * Why Thread? ---> To Utilize the CPU Time Efficently.
 * Multiple Thread ---> Multiple Independent Instructions which are execute in Independetly is know as M.T
 * 
 * Sequentially Exection cant use for the utilize for the cpu time
 * Synchronized which is use for the one thread instruction will not appear to the another Thread Instructions 
 * or not accessing the other Thread properties, Behaviour .
 * join--->which is used for the entire Thread , Exection of one Thread completion and next to another Thread.
 *  
 * -->MultiThrreading--> in  java is a feature that allows concurrent execution
 *  of two or more parts of a program to maximize cpu utilization. 
 * 
 * Multi Threading Can be Achieve in Two Ways --->
 * --> 1) extends thread Class
 * ---> 2) Implement Runnable Interface
 
 * Here We Used ---> extends Thread Class
 * Create a class that extends Thread class
 * run()---> we can't call Directly -->  by using Start() ---> we can call Indirectly
 */
import java.util.*;

class Demo1 extends Thread{
	@Override
	 public void run()
	{
		System.out.println("Printing Characters");
		for(int i=65;i<=69;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Characters Ended");
	}
}
class Demo2 extends Thread{
	@Override
 public void run()
	{
		System.out.println("Printing Numbers");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(4000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Numbers Ended");
	}
}
class Demo3 extends Thread{
	@Override
	 public void run()
	{

		System.out.println("Addition process started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter 2st Number");
		int p = scan.nextInt();
		int add = m+p;
		System.out.println("Addition is:" +add);
		
	}
}
public class MultiThreading1 {

	public static void main(String[] args)  {
		Demo1 d1 = new Demo1();          //Created Objects for the classes
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();		
		//d1.run();// it is sequential Excution  so it isnt utilizing cpu time
		//d2.run();// Directly calling run method so cpu time not utilizing
	//d3.run(); // it is sequential Excution  so it isnt utilizing cpu time		
		d1.start();  // which is used for cpu time effeciently
		//d1.join();   // Which is used to print the order by order
		d2.start();  // start method call the run() method indirectly 
		//d2.join();   
		d3.start();		
	}
}
