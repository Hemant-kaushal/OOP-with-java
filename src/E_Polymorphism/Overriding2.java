package E_Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.makeSound();        // Output: Dog barks
    }
}
