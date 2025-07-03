/*
ReThrowing Exception : If an Exception occurs within a method and is also handled in same method.
                      But Same Exception must also propogate to caller of method then it is reffered Re-Throwing Exception(try-catch-throw-throws-finally)
*/
public class RethrowExample {

    public static void methodA() throws Exception {
        try {
            int result = 10 / 0; // This causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught in methodA: " + e.getMessage());
            throw e; // 🔁 Rethrow the same exception
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e);
        }
    }
}
/*
🔍 Explanation
🔸 1. methodA()
Inside this method, you're performing 10 / 0, which causes an ArithmeticException (/ by zero).

This exception is caught by the catch (ArithmeticException e) block.

A message is printed:

csharp
Copy
Edit
Caught in methodA: / by zero
Then, the same exception is re-thrown using throw e.

🔸 2. main() Method
methodA() is called inside a try block.

Since methodA() rethrows the exception, it propagates back to main().

The catch (Exception e) block in main() catches it.

It prints:

csharp
Copy
Edit
Handled in main: java.lang.ArithmeticException: / by zero

*/
