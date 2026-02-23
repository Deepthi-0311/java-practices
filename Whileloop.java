import java.util.Random;
public class Whileloop {
    public static void main(String[] args){
    //     int i = 0 ;
    //     while(i<=10){
    //         System.out.println(i);
    //         i++;
    //             }
    // }
    int count = 0;
    Random rand = new Random();
    int num = 0;
    while(num!=8){
      num=rand.nextInt(10);
      count = count+1;
    
    System.out.println(num);
    }
    System.out.println("count = " + count

     );
   
}
}

