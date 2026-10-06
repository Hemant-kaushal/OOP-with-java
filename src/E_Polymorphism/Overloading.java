package E_Polymorphism;

class Sum {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Sum c = new Sum();
        System.out.println(c.add(2, 3));       // 5
        System.out.println(c.add(2.5, 3.5));   // 6.0
        System.out.println(c.add(1, 2, 3));    // 6
    }
}

