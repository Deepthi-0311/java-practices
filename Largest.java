package Test;
public class Largest {
    public int Large(int a,int b,int c){
        if(a<b && c<b){
            return b;
        }
        else if (a<c){
            return c;
        }
        else{
            return a ;
        }

    }
    public static void main(String[] args){
      //  Scanner sr = new Scanner(System.in);
        Largest l1 = new Largest();
        System.out.print(l1.Large(67,8,11));
    }
} 
