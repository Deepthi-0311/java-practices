package Test;

public class Numreverse {
    public int num(int n){
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n/=10;
        }
return reverse;
    }

    public static void main(String[] args){
        Numreverse N = new Numreverse();
       System.out.println( N.num(12345));
    }
}

