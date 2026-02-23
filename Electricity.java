package Test;
import java.util.Scanner;
public class Electricity {
    public int current (int u){
        int bill = u*100;
        return bill;
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("enter the unit : ");
        Electricity e = new Electricity();
     System.out.print(e.current(sr.nextInt()));

    }
}
