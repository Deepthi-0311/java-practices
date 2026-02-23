import java.util.Scanner;

public class Forloop {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sr.nextInt();
         System.out.print("Enter b : ");
        int b = sr.nextInt();
        for(int i = a;i<=b; i++){
            System.out.println(i);
        }
int oddcount = 0;
int evencount = 0;
for(int i =1; i<=10; i++){
if(i%2==0){
    System.out.println("even number : " + i);
    evencount=evencount+1;
}
else{
    oddcount = oddcount+1;
    System.out.println("odd number : "+ i);
}
}
System.out.println("evencount: " + evencount);
System.out.println("oddcount : "  + oddcount);
}
}