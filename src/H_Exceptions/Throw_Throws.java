package H_Exceptions;

import java.util.Scanner;

class NegativeRadiousException extends Exception{

    public String toString(){
        return "Radius cannot be negative";
    }

    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class Throw_Throws {
    public static double area(int r) throws NegativeRadiousException{
        if (r<0){
            throw new NegativeRadiousException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        r = sc.nextInt();
        try{
            double area = area(6);
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}