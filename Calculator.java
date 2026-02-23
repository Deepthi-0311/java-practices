package Test;
import java.util.*;
public class Calculator {
    public int cals(int num1,int num2,char operator){
        if(operator == '+'){
            return num1+num2;
        }
        else if(operator =='-'){
            return num1-num2;
        }
        else if(operator =='*'){
            return num1*num2;
        }
            else if(operator == '/'){
               if(num2!=0){
                return num1/num2;
               }else{
                System.out.print("cannot divisible by zero");
                return 0;
               }
            }
        else{
            System.out.print("invalid operator");
            return 0;
        }
        }

    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter the first num 1 : ");
        int num1 = sr.nextInt();
         System.out.print("Enter the second num 2 : ");
        int num2 = sr.nextInt();
         System.out.print("Enter the operator(+,-,*,/) : ");
        char operator = sr.next().charAt(0);
        Calculator c1 = new Calculator();
      System.out.print(c1. cals(num1, num2, operator));
       
    }
}
