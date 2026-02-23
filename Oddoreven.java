package Test;
import java.util.*;
public class Oddoreven {
    public int odd(int n){
        if(n%2==0){
            System.out.println("the given number is even");
            return 0;
        }
else{
     System.out.println("the given number is odd");
    return 1;
}
    }
    

public static void main(String[] args){
    Oddoreven o1 = new Oddoreven();
    Scanner sr = new Scanner(System.in);
   System.out.print(o1.odd(sr.nextInt()));

}

}
