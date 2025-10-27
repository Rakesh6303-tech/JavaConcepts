Absolutely! Here’s a **real-time multithreading example** using **`extends Thread` only** — simple and easy to explain in interviews.

---

## 🧩 **Real-Time Example: Ticket Booking System**

Imagine a **movie theater** with limited tickets.

* Multiple people (threads) try to **book tickets at the same time**.
* We simulate each person as a thread using `extends Thread`.
* It demonstrates **multithreading** and **race conditions** (optional for later synchronization).

---

### ✅ Java Code

```java
// Shared resource: Ticket Booking System
class TicketBooking {
    private int tickets = 5; // Total tickets available

    // Synchronized method to prevent race condition
    public synchronized void bookTicket(String customerName) {
        if (tickets > 0) {
            System.out.println(customerName + " booked a ticket. Tickets left: " + (tickets - 1));
            tickets--;
        } else {
            System.out.println("Sorry " + customerName + ", tickets are sold out!");
        }
    }
}

// Thread class for each customer
class Customer extends Thread {
    private TicketBooking ticketBooking;

    public Customer(TicketBooking ticketBooking, String name) {
        super(name); // Set thread name
        this.ticketBooking = ticketBooking;
    }

    public void run() {
        ticketBooking.bookTicket(getName());
    }
}

// Main class
public class TicketSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        // Creating multiple customer threads
        Customer c1 = new Customer(booking, "Alice");
        Customer c2 = new Customer(booking, "Bob");
        Customer c3 = new Customer(booking, "Charlie");
        Customer c4 = new Customer(booking, "David");
        Customer c5 = new Customer(booking, "Eve");
        Customer c6 = new Customer(booking, "Frank");

        // Start threads
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
```

---

### 🧠 **How it Works**

1. `TicketBooking` is a shared resource with a limited number of tickets.
2. Each `Customer` thread tries to book a ticket.
3. `synchronized` ensures that **only one thread can book at a time** — prevents race conditions.
4. Once tickets are over, remaining threads get a “sold out” message.

---

### 🔹 Sample Output

```
Alice booked a ticket. Tickets left: 4
Bob booked a ticket. Tickets left: 3
Charlie booked a ticket. Tickets left: 2
David booked a ticket. Tickets left: 1
Eve booked a ticket. Tickets left: 0
Sorry Frank, tickets are sold out!
```

---

✅ **Interview Explanation**

> This simulates a **real-time ticket booking system** where multiple users book tickets simultaneously.
> Each user is represented as a thread extending the `Thread` class, and the shared resource is the `TicketBooking` class.

---

If you want, I can create another **real-time example using `extends Thread`** like **Car Parking or ATM Machine** — which is **even closer to your original project idea**.

Do you want me to do that?
