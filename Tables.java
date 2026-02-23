package Test;
import java.util.*;
public class Tables {
    public void table(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(j + "*" + i + "=" + i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        Tables t1 = new Tables();
        t1.table(sr.nextInt());
    }
}
