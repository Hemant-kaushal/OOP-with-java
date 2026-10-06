package D_Inheritance;

// Basic SYNTAX OF INHERITANCE

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}

public class Basic {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();    // Inherited from Parent
        c.display(); // Defined in Child
    }
}

