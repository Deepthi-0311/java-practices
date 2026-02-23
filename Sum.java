package Test;

public class Sum {
    public void SUM (int[] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }
          System.out.print(sum);
    }
    public static void main(String[] args){
        Sum s1 = new Sum();
     s1.SUM(new int[] {1,2,3,4});
    }
    }

