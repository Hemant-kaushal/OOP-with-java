package H_Exceptions;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String [] args){
        int [] marks = new int[3];
        marks[0] = 6;
        marks[1] = 10;
        marks[2] = 21;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int index = sc.nextInt();

        try{
            System.out.println("Lets start");
            try{
                System.out.println(marks[index]);
            }
            catch (ArithmeticException e){
                System.out.println("This value of inedex does not exit");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}
