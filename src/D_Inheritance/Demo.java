package D_Inheritance;

// USING GET AND SET TO CALL AND PRINT SUPERCLASS

class Base{
     int x;

    int getx(){
        return x;
    }
    void setx(int x){
        System.out.println("Set the value of X from Base:");
        this.x = x;

    }
}
class Derived extends Base{
    int y;

    int gety(){
        return y;
    }
    void sety(int y){
        this.y = y;

    }
}
public class Demo {
    public static void main(String[] args){

        // Creating a object of Base calss
        Base b = new Base();
        b.setx(22);
        System.out.println(b.getx());

        // Creating a object of Derived calss
        Derived d = new Derived();
        d.setx(34);
        System.out.println(d.getx());
    }
}
