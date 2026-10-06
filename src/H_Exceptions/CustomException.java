package H_Exceptions;

import java.util.Scanner;

class AgeException extends Exception{

    public String toString(){
        return "Age cannot be greater then 100()";
    }

    public String getMessage(){
        return "The age which is entered is must be correct";
    }
}
public class CustomException {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        a = sc.nextInt();
        if(a<9){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is the exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}

