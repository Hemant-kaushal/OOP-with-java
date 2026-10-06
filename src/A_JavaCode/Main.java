package A_JavaCode;

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.print("My name is " + name);
        System.out.println(" and my id is " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "Hemant";

        // Setting Attributes for John
        john.id = 17;
        john.name = "Rachit";

        // Printing the Attributes

        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
    }
}

