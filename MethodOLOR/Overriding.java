package programs;
import java.util.*;
/*
 * Method Overriding 
 * 
 * Method Overriding is also know as RunTimePolymophism
 * 
 * Def--> is a process of Inheriting a Method From Parent CLass(Base Class)
 *      to Child Class(Sub Class) and Changing Body Of Method in a subclass is Called Method Overriding
 * 
 * <---In This Program---->
 * 
 * Boot() ---> Inherited and Changing Body of Method in Subclass
 * ShutDown() ---> Is Inherited
 * PlayGames() --->  Specialized Method
 * 
 * <-----Rules Of The Method  Overrding--->
 * 
 *  when a method is overloaded from parent to subclass The Axcess modifier should be same
 *  Increase the visiblity of Axcess Modifier
 *  But Dont Decrease the Visiblity of Axcess Modifier
 *  Private & Fianl Can't Be Overridden
 *  
 *  <------Interview Questions------>
 *  Can we override a method declared as final & private Method?
 *      No. final methods cannot be overridden.
 *      No. Private methods are not visible to subclasses, so they cannot be overridden.
 */
class OS{
	public void Boot() {
		System.out.println("Os is Boosting");
	}
	public void ShutDown() {
		System.out.println("Os is ShutDown");
	}
}
class Windows extends OS{
	@Override
	public void Boot() {
		System.out.println("Windows is Boosting");
	}
	// Specialized Method
	public void PlayGame() {
		System.out.println("Playing Games");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Windows w = new Windows();
		w.Boot();
		w.PlayGame();
		w.ShutDown();  // Special Method
		
		
		// Method Overriding with Polymorphism
//		OS os = new Windows();  // Upcasting
//		os.Boot();  // Calls overridden method from Windows
//		os.ShutDown();  // Calls OS’s method

		

	}

}
