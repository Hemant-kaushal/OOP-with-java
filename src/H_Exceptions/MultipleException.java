package H_Exceptions;

import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args){
        int[] marks = new int [3];
        marks[0] = 32;
        marks[1] = 21;
        marks[2] = 45;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to dive the value with:");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is" +marks[index]);
            System.out.println("The value is: "+marks[index]/number);

        }
        catch (ArithmeticException e){
            System.out.println("Some exeption occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some exeption occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exeption occured");
            System.out.println(e);
        }
    }
}
