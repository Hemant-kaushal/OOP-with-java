package B_Constructor;

// DEFAULT CONSTRUCTOR

class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // Default constructor is called
        student1.display(); // Outputs: 0 Unknown
    }
}

