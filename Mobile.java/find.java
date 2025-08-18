import java.util.Scanner;
public class find {

    void evenorodd(int num){
        if(num%2==0)
        {
           System.out.print("even number"); 
        }
        else{
            System.out.print("odd number");
        }
    }
    pubic static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        int number = sr.nextInt();
        find obj1=find();
        obj1.evenorodd(number);

    }
    
}
