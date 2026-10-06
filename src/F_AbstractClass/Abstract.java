package F_AbstractClass;

abstract class Parent{
    public void morning(){
        System.out.println("Good Morning");
    }
    public void afternoon(){
        System.out.println("Good Afternoon");
    }
    abstract public void greet();
}

class Child extends Parent{
    public void greet(){
        System.out.println("Hello Mr. kaushal");
    }
}

public class Abstract {
    public static void main(String[] args){
        Child obj = new Child();     // Allowed
        //Parent ob = new Parent();  // NOt allowed

        obj.greet();
    }
}
