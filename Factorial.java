package Test;
import java.util.*;
public class Factorial {
    public int Fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
       return fact;
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("enter n : ");
        Factorial f1 = new Factorial();
        System.out.println(f1.Fact(sr.nextInt()));
    }
}
