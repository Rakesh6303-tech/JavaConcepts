package oops;
/*
 * Daemon Thread is known as Helping Threads
 * Which is helps to 
 * In Java, a Daemon thread is a special type of thread that runs in the background 
 * to provide services or support to other threads (called user threads).
 */
import java.util.*;

class Captain extends Thread{
	@Override
	public void run()
	{
		try {
			
			BattingCoach bac = new BattingCoach(); // Controlled by Captain
			bac.setName("BATTINGCOACH");
			
			BowlingCoach boc = new BowlingCoach();  // Controlled By Captain
			boc.setName("BOWLINGCOAH");
			
			
			bac.setDaemon(true);  // Setting the Daemon Thread
			boc.setDaemon(true);
			
			bac.start();         // run() the method using start() method
			boc.start();
			
			System.out.println("Captain goes to the Ground");
			Thread.sleep(3000);
			System.out.println("Captain Doing WarmUp");
			Thread.sleep(3000);
			System.out.println("Captain Practising Catches");
			Thread.sleep(3000);
			System.out.println("Captain Doing Batting");
			Thread.sleep(3000);
			System.out.println("Captain Doing Bowling");
			Thread.sleep(3000);
			System.out.println("Captain goes to Hotel");
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class BattingCoach extends Thread{
	@Override
	public void run()
	{
		for(; ;)  // Infinite loop
		{
			System.out.println("Batting Coach is in the Ground");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{
	@Override
	public void run()
	{
		for(; ;)  // Infinite loop
		{
			System.out.println("Bowling Coach is in the Ground");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		Captain ca = new Captain();
		ca.setName("CAPTAIN");  // setting name to small Stack
		ca.start();
	}

}
