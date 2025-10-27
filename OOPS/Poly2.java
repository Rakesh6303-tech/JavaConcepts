//🔧 Real-Time Example (Bank Payment Example)
//Imagine you’re developing a payment system for an e-commerce website.
//You have multiple payment types:
//Credit Card, Debit Card, UPI
//All these share a common action: makePayment(),
//but each one processes it differently.

// Parent class - defines a general payment behavior
class Payment {
    // Method that can be overridden by child classes
    void makePayment() {
        System.out.println("Making a generic payment");
    }
}

// Child class 1 - specific type of payment (Credit Card)
class CreditCardPayment extends Payment {
    // Overriding parent class method to provide specific implementation
    void makePayment() {
        System.out.println("Payment done using Credit Card");
    }
}

// Child class 2 - specific type of payment (Debit Card)
class DebitCardPayment extends Payment {
    // Overriding parent class method
    void makePayment() {
        System.out.println("Payment done using Debit Card");
    }
}

// Child class 3 - specific type of payment (UPI)
class UpiPayment extends Payment {
    // Overriding parent class method
    void makePayment() {
        System.out.println("Payment done using UPI");
    }
}

// Main class to test polymorphism
public class Main {
    public static void main(String[] args) {

        // Reference variable of parent class
        Payment p;

        // Parent reference holding object of child class (CreditCardPayment)
        // This will call the overridden method from CreditCardPayment
        p = new CreditCardPayment();
        p.makePayment(); // Output: Payment done using Credit Card

        // Now parent reference refers to DebitCardPayment object
        // This will call the overridden method from DebitCardPayment
        p = new DebitCardPayment();
        p.makePayment(); // Output: Payment done using Debit Card

        // Parent reference refers to UpiPayment object
        // This will call the overridden method from UpiPayment
        p = new UpiPayment();
        p.makePayment(); // Output: Payment done using UPI
    }
}
