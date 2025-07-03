package oops;
/*
 * Polymorphism basically is dervied from Greek Word
 * poly------->many
 * morphism---->forms
 * Polymorhism is also known as Loose Coupling
 * Creating Parent type Refernce to child object is called L.C or Polymorphism
 * There are Two Types of Polymorphism
   1) Compile Time Polymorphism (Method Overloading)
   2) Run Time Polymorphism (Method Overridig) 
 * Specialized Method (S.M) are not allowed in Polymorphism
 * if we want acheive S.M we have to do Down casting
 * Down Casting ((childclassname)parentRef).specialzed method();
 * 
 */
import java.util.*;
class Plane{       // Parent Class
	void fly()  
	{
		System.out.println("Plane is Flying");
	}
}
class CargoPlane extends Plane{  // extends parent class
	@Override
	void fly()                   
	{
		System.out.println("CargoPlane is Flying at low height");
	}
	void carrycargo()           // Specialized Methods
	{
		System.out.println("CargoPlane is carrying cargo");
	}
	
}
class PassengerPlane extends Plane{  // extends parent class
	@Override
	void fly()                     
	{
		System.out.println("PassengerPlane is flying at medium height");
	}
	void carryPassenger() {    // Specialized Methods
		System.out.println("PassengerPlane is carrying Passenger");
	}
}
class FighterPlane extends Plane{   // Extends parent class
	@Override
	void fly()                     
	{
		System.out.println("FighterPlane is flying at Greater Height");
	}
	void carryFighter() {           // Specialized Methods
		System.out.println("FighterPlane is carrying Weapons");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();           // Created Objects to the Subclass
		PassengerPlane pp = new PassengerPlane();   // 
		FighterPlane fp = new FighterPlane();
		
		Plane ref;  // Created Parent type Reference
		
		ref=cp;     // Child object Giving Parent type Refernce
		ref.fly();  // Parent type refernce calling fly method
		
//		ref.carrycargo();// Exception for parent ref not axcessing special method in polymorphism
		
		((CargoPlane)ref).carrycargo();  // Down Casting ((childclassname)parentRef).specialzed method();
		
		ref=pp;
		ref.fly();
		((PassengerPlane)ref).carryPassenger();
		
		ref=fp;             // loose coupling 
		ref.fly();
		((FighterPlane)ref).carryFighter();  // D.C
		
//		cp.fly();
//		fp.fly();     Tight Coupling
//		pp.fly();

	}

}
