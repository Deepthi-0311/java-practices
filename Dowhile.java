import java.util.Scanner;

public class Dowhile {
     public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        int a;
    do{
        System.out.println("enter a number > 10 : ");
        a = sr.nextInt();
    if(a<10){
        System.out.print("Re enter the input");
    }
}
    while(a<=10);
        System.out.print("you entered " + a);
    }
}