package B_Constructor;

// COPY CONSTRUCTOR

class Person {
    String name;
    int age;

    // Constructor to initialize values
    Person(String Personname, int Personage) {
        name = Personname;  // Assign parameters to instance variables
        age = Personage;
    }

    // Copy constructor
    Person(Person another) {
        name = another.name;  // Directly access the instance variable from 'another'
        age = another.age;
    }

    // Method to display the details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        Person p1 = new Person("John", 25);

        // Create a new object using the copy constructor
        Person p2 = new Person(p1);

        // Display the details of both objects
        p1.display();
        p2.display();
    }
}
