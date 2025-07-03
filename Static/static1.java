package program;
/*
 * What is Static?
 * is a powerful tool that can be used for the improve Efficency and readibility code
 * 
 * ---->Why we use or Give Varabile to Static?
 *          which is used for the Utilize of Memory Efficency
 * 
 * ---->To When you should give Static Varaible?
 *          In our Class Which has Common for all this Instructions 
 *           Below Example has Rate of Interest is Common for all
 * Example : Addhar card has Indians Identity 
 *            so we make Nationality as Indian as A static
 *            Remaning like Dob, Address are Different
 * 
 * ----->Why should we give any Block as a Static?
 *          If you want to Execute some Instructions Exactly  Before Main Method.
 *          Such Instructions We have to Put In Static Block
 *Example : class Demo{
 *              static {
 *                    sop("India");
 *               }
 *           public static void main String(args []){
 *                 sop("pakistan");
 *            }
 *            }
 *    output---> India, Pakistan
 *    
 *------->Why should we give any method as a static?
 *   Let's assume we've 2 Methods
 *   1) static void MileToKms(){
 *       1 mile = 1.6kms;
 *     }
 *   2) void Milage(){
 *   
 *   }
 * I'll Give U some Cars like Forturner, Beanz, Jeep, Lamborga, Marthi
 * Task1---> You have to Travel only 1 mile for all Cars
 *          Here in all Cars we get same mile for All Cars 
 *          So We make Static that Method
 * 
 * why not to give Milage as static?
 * Task2---->I'll Give 1 litre Petrol for each indidual Car You have to Travel until Petrol is over
 *      -----> car1 10kms, car2 13kms, car3 12 kms, etc.
 *    Here Kms are Different so we cant give as a  Static
 *    
 * ------->Can we Make class Has a Static?
 *           Yes u can make class as a static for only Internal Classes
 *           Dont Make External Class as a Static
 *  
 *  Example:  Class Demo1{
 *              Static class Demo2{
 *           }
 *         }
 *         
 *Can I make Static to the Local Varaibles Which are present inside Method?
 *No We can't make as a static 
 *
 *
 *         
 *        
 */
import java.util.*;
class Farmer{
	float p;
	float t;
	static float r;
	float si;
	
	static {
		r = 2.5f;
	}
	void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p= scan.nextFloat();
		System.out.println("Enter the Time Duration");
		t = scan.nextFloat();
		
	}
	void calculate()
	{
		// Formula for the simple interest Compound
		si = (p*t*r)/100;

	}
	void Display()
	{
		System.out.println("The Simple Interest is "+ si);
	}
}
public class Static2 {

	public static void main(String[] args) {
		Farmer far = new Farmer();
		far.acceptInput();
		far.calculate();
		far.Display();
		
		Farmer far2 = new Farmer();
		far2.acceptInput();
		far2.calculate();
		far2.Display();

	}

}
