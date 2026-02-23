package Test;

public class Primeornot {
      public static void main(String[] args){
        boolean found = false;
        int a = 78;
        for(int i =2;i<=Math.sqrt(a);i++){
        if(a%i==0){
            System.out.print("the given is not prime number");
            found = true;
            break;
        }
        }
        if(!found){
            System.out.print("the given number is prime number");
        }
    }
}
