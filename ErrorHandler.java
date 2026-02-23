import java.util.*;
public class ErrorHandler {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
    try{ 
         System.out.println(a/b);
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    // catch(StringIndexOutOfBoundsException e){
    //     System.out.println(e.getMessage());
    // }
     String s = "madam";
    System.out.println(s.charAt(2));
    System.out.println("completed");
    }
}
