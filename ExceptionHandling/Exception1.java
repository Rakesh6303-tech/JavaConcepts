package oops;
/*  Exception : The problem that happens during the execution of progrram is known as  exception
*   Exception Handling : The process avoiding the abrupt termination (potential loss of data) of the program is know as EH.

 * There are Three Ways to Handle the EH:
   1) Handling Exception (try - catch ) 
   2) Re-Throwing Exception ( try-catch - throw - throws- finally)
   3) Ducking Exception.

 * Exceptions are classified into two types:
 * 1) checked Exception (During Compliation)----> FileNotFound, SocketExeception , Sql Exception 
 * 2) unchecked Exception (During RunTime)  -----> Arthematic Exceoption, InputMisMatch Exception , Negative Array size
 
 * Below example i want to print A,B,C,D by using seconds one after one will be printing
 * Below is Example for Checked Exception
 * --> try block--> Which is used to Generate  Exception in the try block
 * --> catch block--> will catch the exception from the try block
 
 Below Example for the using 1) try and catch 
 */
import java.util.*;
public class Exception1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=65;i<=69;i++) // A to E
		{
			if(i%2==0)
			{
				System.out.println((char)i); // condition
			}
			System.out.println((char)i);
//           Thread.sleep(3000);             Checked Exception During Compilation 
			try {               // to avoid CE we use try & catch 
				Thread.sleep(3000);  // Sleep is a method This is Seconds Every 3 seconds after letter will be printed
			}
			catch(Exception e)  // catch the exception if occur in the try
			{
				System.out.println("Some Problem Occured");
			}
		}
		}
}
