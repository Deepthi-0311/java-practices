import java.util.Scanner;

public class Codingchallenge2{
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = sr.nextInt();
        if(score<50){
            System.out.print("you need to improve");
        }
        else if(score>=50 && score<70){
            System.out.print("good job");
        }
        else if(score>=70){
            System.out.println("excellent performance");
        }
}
}

