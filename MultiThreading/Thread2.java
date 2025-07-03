package oops;
/*  How will Achieve Multi Threading by using single run() 
 *  Using Single run() method we call multiple Methods
 *  Before calling the Start() we have to do Set the names to Thread
 *  By using---> setName();
 *  After we need to call the run() by using start();
 *  
		Thread t = Thread.currentThread();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.MIN_PRIORITY); // Methods
		System.out.println(Thread.MAX_PRIORITY); // Methods 
		System.out.println(t.getPriority());
		System.out.println(t.getName());
Output --> Thread[#1,main,5,main]
		 #1--> refers to the unique ID of the thread assigned by the JVM
		 main --> thread's name
		 5 -- > Thread's Priority
		 main --> thread group to which the thread belongs.
 *  
 */
import java.util.Scanner;

class Demo extends Thread{  // Extending the thread class 
	
	public void run()// run() come From Thread, Created only Single run() for Multiple Methods
	{
		Thread t = Thread.currentThread(); // It Represents the Current Thread and Give Whole Info about Thread
		String s = t.getName();  // only  Particular Thread Name
		
		if(s.equals("PRINTCHAR"))  // Condtion is True
		{
			PRINTCAPITALCHAR();   // Goes to the 1st Method
		}
		else if(s.equals("PRINTNUMBER"))
		{
			PRINTNUMBERS();      // Goes To The Method
		}
		else {
			ADDITION();          // Goes to the Method
		}
	}
	public void PRINTCAPITALCHAR()     // 1st Method
	{
		System.out.println("Printing Characters");
		for(int i=65;i<=69;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(3000);   // Waiting for Time
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Characters Ended");
	}	
	public void PRINTNUMBERS()        //2nd Method
	{
		System.out.println("Printing Numbers");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(4000);    // Waiting for  Time
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Printing Numbers Ended");
	}
	
	
	public void ADDITION()                 // 3rd Method
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
public class Thread3 {
	public static void main(String[] args) {	
		Demo d1 = new Demo();  // JVM Created Class Object to Generate Small Stack frames(Thread) in Stack Frames
		Demo d2 = new Demo();  
		Demo d3 = new Demo();
		d1.setName("PRINTCHAR");  // We have to Give Thread Names by using setName
		d2.setName("PRINTNUMBER");  
		d3.setName("PRINTADDITION"); 
		d1.start();    // Indirectly calling the run() by using start method
		d2.start();
		d3.start();
		
	}

}


