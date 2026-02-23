import java .util.*;
public class CodingChallenge1 {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = sr.nextInt();
        if(mark>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }


        System.out.println("Enter your number: ");
        int n =sr.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("the given number is divisible by both 3 and 5");
        }
        else{
            System.out.println("the given number is not divisible by 3 and 5");
        }
    }
    
}
