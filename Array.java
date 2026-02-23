import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[5];
         Scanner sr = new Scanner(System.in);
         arr[0]=sr.nextInt();
         arr[1]=sr.nextInt();
         arr[2]=sr.nextInt();
         arr[3]=sr.nextInt();
         arr[4]=sr.nextInt();
         System.out.print(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
}
}
