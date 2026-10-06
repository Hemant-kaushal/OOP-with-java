package B_Constructor;

// PARAMETERIZED CONSTRUCTOR

class Students {
    int id;
    String name;

    // Parameterized constructor
    Students(int studentid, String studentname) {
        id = studentid;
        name = studentname;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Students student1 = new Students(1, "Alice"); // Parameterized constructor is called
        Students student2 = new Students(2, "Bob");
        Students student3 = new Students(3, "Hemu");
        student1.display(); // Outputs: 1 Alice
        student2.display(); // Outputs: 2 Bob
        student3.display();
    }
}

//public class Car {
//    int ModelYear;
//    String ModelName;
//
//    // Parameterized constructor
//    Car(int year, String name){
//        ModelYear = year;
//        ModelName = name;
//    }
//    public static void main (String[] args){
//        Car Mycar = new Car(1926, "Mercedes");
//        System.out.println(Mycar.ModelYear +" "+ Mycar.ModelName);
//    }
//}
//
