package oops;
import java.util.*;
/*
 * Example for Achieving Multi threading using--->Extends Thread
 */
class SmallAlpha extends Thread {
	@Override
	public void run()
	{
		System.out.println("Small Alphabet Printing");
		for(int i=97;i<=101;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Small Alphabet Over");
	}
}
class CapitalAlpha extends Thread{
	@Override
	public void run() {
		System.out.println("Capital Alphabet Printing");
		for(int i=65;i<=69;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(6000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Capital Alphabet Over");
		
	}
}
class Numbers extends Thread{
	@Override
	public void run()
	{
		System.out.println("Numbers Printing");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(7000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Numbers Printing Over");
	}
}
class Addition extends Thread{
	@Override
	public void run()
	{
		System.out.println("Addtion Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number");
		int b = scan.nextInt();
		int r = a+b;
		System.out.println("Addition is:" +r);
	}
	
}
class Substraction extends Thread{
	@Override
	public void run()
	{
		System.out.println("Substraction Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		int result = m-n;
		System.out.println("Substraction is:" +result);
	}
}
public class Thread1 {
	public static void main(String[] args) {
		SmallAlpha  sa = new SmallAlpha();
		CapitalAlpha  ca = new CapitalAlpha();
		Numbers  na = new Numbers();
		Addition  ad = new Addition();
		Substraction  sb = new Substraction();
		sa.start();
		ca.start();
		na.start();
		ad.start();
		sb.start();
			
	}
}
