import java.util.Scanner;

public class Ternary {
    // ternary operater
    //   Syntax :
        //    condition ? ("true" : "false")
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sr.nextInt();
         System.out.print("Enter b : ");
        int b = sr.nextInt();
        System.out.print(a<b ? " b greater" : " a smaller");
    }
}
