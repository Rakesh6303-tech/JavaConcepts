Ducking Exception Def: 
--->If an Exception occurs within a Method and the method does not want to handle it. 
  Instead it wants to hand over the exception the responsiblity of handling the exception to caller method. is called ducking an exception

--->To acheive this, the throws keyword is used.

  // Below program Explanation
  1)The Exception gets generated inside fun() method in Demo1 class and then it goes to the Runtime SYstem
  2)The RTS comes back to fun() and checks can the exception be handled in same method.
  3)The fun() is not handling exception it is simply handover the exception to caller of method using throw keyword in signature of method.
  4) In this program fun() method is called from main() method now the control given to main() and exception is handled in main() using try-catch.
  5)Due to which connection2 terminated is not printed as control is given to main() once exception occurs.
  6)According to case-3 by using throws, we are not handling exception in the method which it occurs; instead, we are ducking it.

import java.util.*;
class Demo1{
  void fun1() throws Exception{
    System.out.println("Connection2 is Estd");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Numeartor");
    int a = scan.nextInt();
    System.out.println("Enter the Denominator");
    int b = scan.nextInt();
    int c = a/b;
    System.out.println(c);
    System.out.println("Exception handled in fun1()");
    System.out.println("Connection2 is terminated");
  }
}
public class Demo{
  public static void main(String args [])
  {
    System.out.println("Connection1 is Estd");
    try{
      Demo1 d1 = new Demo1();
      d1.fun1();
      
    }
    catch(Exception e)
    {
      System.out.println("Exception handled in main()");
    }
    System.out.println("Connection1 is terminated");
  }
}
