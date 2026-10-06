package D_Inheritance;

// USING SUPER KEYWORD TO CALL SUPERCLASS CONSTRUCTOR

class Base1{
    Base1(){
        System.out.println("I am a Consructor of Base1");
    }
    Base1(int x){
        System.out.println("I am a overloaded Consructor of Base1 with value of X: "+ x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Consructor of Derived1");
    }
    Derived1( int x, int y){
        //super();
        super(x);
        System.out.println("I am a overloaded Consructor of Derived1 with value of X: "+ y);
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am a Consructor of ChildOfDerived1");
    }
    ChildOfDerived1( int x, int y, int z){
        //super();
        super(x,y);
        System.out.println("I am a overloaded Consructor of ChildOfDerived1 with value of z: "+ z);
    }
}

public class Constructor {
    public static void main(String[] agrs){
        //Base b = new Base();
        //Base1 b = new Base1(2);
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(2,5);
        //ChildOfDerived1 c = new ChildOfDerived1();
        ChildOfDerived1 c = new ChildOfDerived1(1,5,9);
    }
}
