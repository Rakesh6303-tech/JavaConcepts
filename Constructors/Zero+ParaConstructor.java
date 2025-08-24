class Customer {
    private int cid;
    private String cname;
    private long cnum;

    // Zero Parameterized Constructor
    public Customer() {
        System.out.println("Zero parameterized constructor called");
        cid = 01;
        cname = "Max Developer";
        cnum = 6573894532L;
    }

    // Parameterized Constructor
    public Customer(int cid, String cname, long cnum) {
        System.out.println("Parameterized constructor called");
        this.cid = cid;
        this.cname = cname;
        this.cnum = cnum;
    }

    public void display() {
        System.out.println("Customer Id: " + cid);
        System.out.println("Customer Name: " + cname);
        System.out.println("Customer Number: " + cnum);
    }

    public static void main(String[] args) {
        // Using Zero Parameterized Constructor
        Customer c1 = new Customer();
        c1.display();

        System.out.println("----------------");

        // Using Parameterized Constructor
        Customer c2 = new Customer(101, "Rakesh", 9876543210L);
        c2.display();
    }
}
