package oops;

/*
 * Multi Threading Can be Achieve in Two Ways --->
 * --> 1) extends thread Class
 * ---> 2) Implement Runnable Interface
 * 
 * Here We used 2nd Type ---> Implements Runnable Interface
 * In this we are Creating Thread Classes for Generating new Small Stack Frames or Threads
 * and We Passed the object Ref or arguments into the Thread Classes
 * Calling Indirectly run() by using ---> Start()
 */
import java.util.*;
class Demo5 implements Runnable{
	public void run()
	{
		System.out.println("Printing Characters");
		for(int i=65;i<=69;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Characters Ended");
	}
}

class Demo6 implements Runnable{
	@Override
	public  void run()
	{
		System.out.println("Printing Numbers");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Numbers Ended");
	}
}

class Demo7 implements Runnable{
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
public class Thread2 {
	public static void main(String[] args) {
		 Demo5 d5 = new Demo5();
		 Demo6 d6 = new Demo6();
		 Demo7 d7 = new Demo7();
		 
		 Thread t1 = new Thread(d5); // Created for small Stacks in the stack segment
		 Thread t2 = new Thread(d6); // we passed the argument into the costructor
		 Thread t3 = new Thread(d7);
		 t1.start();                // calling indirectly run method
		 t2.start();
		 t3.start();

	}

}


