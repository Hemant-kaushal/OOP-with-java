package H_Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The result is: " +c);
        }
        catch (Exception e){
            System.out.println("We fail to dive. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of Program");

    }
}
