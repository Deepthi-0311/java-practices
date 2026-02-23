package Test;

public class Counting {
    public static int[] ans(int[] arr){
        int[] array = new int[3];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                array[0]++;
            }
            else if(arr[i]<0){
                array[1]++;
            }
            else{
                array[2]++;
            }
        } 
        return array;
    }
    public static void main(String[] args){
        int[] result = ans(new int[]{4,0,9,7,-1,-6,0,8,0,-4});
        System.out.println("positive : " + result[0]);
        System.out.println("negative : " + result[1]);
        System.out.println("zero : " + result[0]);
    }
}
