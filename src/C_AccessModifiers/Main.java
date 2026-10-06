package C_AccessModifiers;

class Modifiers {
    private int i = 2;
    public int j = 22;
    protected int k = 3;
    int l = 4;

    private void hii(){
        System.out.println("Hey!");
    }

    public void hello(){
        System.out.println("Hello to all");
    }

    protected void bye(){
        System.out.println("Bye to all");
    }

    void display(){
        System.out.println("Value of i = " +i);
    }

}
public class Main extends Modifiers{
    public static void main(String[] args){
        Modifiers a = new Modifiers();

        //a.hii();  // This will generate error becouse "hii" is private
        a.hello();
        a.bye();
        a.display();
        //System.out.println(a.i);
        System.out.println(a.j);
        System.out.println(a.k);
        System.out.println(a.l);
    }
}