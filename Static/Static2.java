package program;
class Test{
	static int a,b;
	static {
		System.out.println("Inside static  Block");
		a=10;
		b=20;
	}
	static void fun1() {
		System.out.println("Inside static Method");
	}
	int x,y;{
		System.out.println("Inside instance block");
	}
	void fun2() {
		System.out.println("Inside Instance Method");
	}
	Test(){
		System.out.println("Inside Constructr");
		
	}
}
public class Statci1 {

	public static void main(String[] args) {
		Test.fun1();
		Test t = new Test();
		t.fun2();
	}

}
