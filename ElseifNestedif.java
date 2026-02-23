import java.util.Scanner;

public class ElseifNestedif {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = sr.nextInt();
        if(score>=35 && score<60){
            System.out.print("video game");
        }
        else if(score>=60 && score<90){
            System.out.print("Iphone");
        }
        else if(score>90){
            System.out.print("macbook pro");
        }


        // Nestedif
boolean kfc = true;
boolean chicken = true;
if(kfc){
    System.out.println("Enter into kfc");
    if(chicken){
        System.out.println("eating chicken");
    }
}

    }

    
}
