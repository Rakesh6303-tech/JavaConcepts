package program;
import java.util.*;
/*
 * Interfaces is a Collection of Pure Abstract Methods.
 * By using Implements keyword we can use interface.
 * Example RealTime---->A Manager Give a Task to 3 Developers to perform ADD,SUB--->
 * ---->so the 3 Dev accepted the task .
 * ---> Dev 1 add(), sub(). --> Dev 2 addition (), substraction(). -->Dev 3 sum(), diff().
 * ---> so here function is same but users get difficult for remeber the multiple method names.
 * ---> so we introduced the standarzation---> 
 * 
 * * From JDK 8 --> we provide methods also in the interfaces by declaring default   
 * * From JDk 8 we introduced static also 
 * it help us to we can acess the method without creating the object, extends the class, implements the class
 * 
 * Inside Interface you have only method  with a signature without body
 * we have 11 Rules for Interfaces.
 * 1) An Interface is like a contract which when implemeted helps to achieve Standarztion. 
 * Below Program use for the standalization.
 * 2)Interfaces promote Polymorphism.
 * 3) methods within an interface are automatically public, abstract
 * 4) specialized methods cant be acessed directly using interface type reference
 * 5) if a class is partially implements interface, it must be declare itself as abstract.
 * 6) A class can implement multiple interfaces 
 * 7) An Interface cannot implement another interface because interface cant provide methods with bodies inside it
 * 8) An Interface can extend Another Interface 
 * 9) A class can both extend another class as well as Implement an Interface
 * 10) Marker Interface:-An interface with no methods or fields, used to mark a class for special behavior.
        Example: Serializable, Cloneable.
 * 
 * <----Interview Questions--->
 * Can we create objects of an interface?
 *     No, interfaces cannot be instantiated directly. You need a class that implements the interface.
 *     
 * What happens if a class does not implement all methods of an interface?
 *     The class must be declared abstract, otherwise you get a compile-time error.
 *     
 * What is the use of default methods in interfaces?
 *    Default methods allow you to add new methods to interfaces without breaking existing implementations.
 *    
 * Can interfaces be private or protected?
 * No. Top-level interfaces can only be public or package-private. Nested interfaces can be private, 
 * protected, or public.


 */
interface Calculator{
	//default void add() {   // from jdk 8
		
	//}
	void add();
	void sub();
}
class MyCalculator1 implements Calculator{  // define as abstract rule is 5
	@Override
	public void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	@Override
	public void sub()
	{
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}
//	@Override                 Rule ---> 5
//	public void sub()       if a class is partially implements it must declare as abstract
//	{
//		int a = 200;
//		int b = 100;
//		System.out.println(a-b);
//	}
//	public void multi()  // Special Method cannot be accessed directly ...> Rule 4
//	{
//		int a = 200;
//		int b =100;
//		System.out.println(a*b);
//	}
}
class MyCalculator2 implements Calculator{
	@Override
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int b = scan.nextInt();
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int b = scan.nextInt();
		System.out.println(a-b);
	}
	
}
class MyCalculator3 implements Calculator{
	@Override
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int b = scan.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(a+b);
		}
	}
	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int b = scan.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(a-b);
		}
		
	}
}




public class Interface1 {

	public static void main(String[] args) {
		MyCalculator1 mc1 = new MyCalculator1();
//		Calculator c;  // Interfaces promotos Polymorphism....>Rule 2
//		c=mc1;        
//		c.add();
//		c.sub();
//		c.multi();        // Rule   4
		MyCalculator2 mc2 = new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();
		mc1.add();
		mc1.sub();
		mc2.add();
		mc2.sub();
		mc3.add();
		mc3.sub();
		
		

	}

}


//Rule 6 a class can implement multiple interfaces 
//interface calcultor1{
//	  void add();
//	  void sub();
//	}
//	interface calcultor2{
//	  void mul();
//	  void div();
//	}
//	class MyCalculator implements calcultor1,calcultor2{
//	  @Override
//	  public void add(){
//	    int a =20;
//	    int b=40;
//	    System.out.println(a+b);
//	  }
//	  @Override
//	  public void sub(){
//	    int a  = 40;
//	    int b=20;
//	    System.out.println(a-b);
//	  }
//	  @Override
//	  public void mul(){
//	    int a =20;
//	    int b=40;
//	    System.out.println(a*b);
//	  }
//	    @Override
//	  public void div(){
//	    int a =20;
//	    int b=40;
//	    System.out.println(a/b);
//	  }
//	}
//	public class interface1{
//	  public static void main(String args []){
//	    MyCalculator mc = new MyCalculator();
//	    mc.add();
//	    mc.sub();
//	    mc.mul();
//	    mc.div();
//	    
//	  }
//	}
