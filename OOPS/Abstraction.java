package oops;
/*
 * Abstraction is the Process of Hiding the Implementation & Showing the Necessarry Information to the User.
 * Abstraction Method ---> It consists only Method Signature no body.
 * Abstract Class ---> It is Restricted We can't create Objects to that class.
 * -->Real Time Example--> Phone Pay Transaction Between User & Recevier
 * ------->But we Don't Know How the Internal Process how it  Will Work
 * --------> The Internal Process Will Hide & showing Necessary Information to the user.
 * 
 *         <---Below are Rules of Abstraction---> 
 * ---> If in a class has one Abstract Method We Must Decalre it has as a Abstract.
 * ---> Abstraction have both Abstract Methods nd Regular Methods.
 * ---> Abstract nd Final Keywords are'nt Use Together.
 * ---> Abstract class Can Inherit from Another Abstract Class

 * Difference between Abstraction and Interfaces
 *  Abstraction can have constructors and interface dont have constructors
 *  Abstraction have both abstract methods and concerte methods, will Interfaces have only Pure Abstract methods

<-----------------Example----------------------->
 📱 3. Mobile Phone
When you use a smartphone:
You tap icons to make a call or send a message.
You don’t see how the phone converts your touch into signals, connects to networks, or processes data.
✅ Abstraction: The user interface hides the complex software and hardware logic.
 * 
 */
abstract class animal{
	abstract void makesound(); // Abstract method Signature
}
class Dog extends animal
{
	 void makesound() // Must implement the inherited abstract method
	{
		System.out.println("woof!");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Dog D = new Dog();
		D.makesound();

	}

}
