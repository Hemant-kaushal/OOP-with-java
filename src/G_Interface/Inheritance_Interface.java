package G_Interface;

interface ParentInheritance{
    void meth1();
    void meth2();
}

interface ChildInheritance extends ParentInheritance{
    void meth3();
    void meth4();
}

class myClass implements ParentInheritance{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth1");
    }
    void meth3(){
        System.out.println("Meth1");
    }
    void meth4(){
        System.out.println("Meth1");
    }
}

public class Inheritance_Interface {
    public static void main(String[] args){
        myClass obj = new myClass();
        obj.meth3();
    }
}
