class Student {
    String name;
    int age;
    
    // Zero parameterized constructor
    Student() {
        System.out.println("Zero parameterized constructor called");
        name = "The Maxi";
        age = 22;
    }
    //  This method prints the student’s details.
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // calls zero parameterized constructor
        s1.display();
    }
}

Output : 
Zero parameterized constructor called
Name: The Maxi, Age: 22
