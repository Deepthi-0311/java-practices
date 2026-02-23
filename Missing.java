public class Missing {
    public int MissingNum(int[] arr){
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int i =0;i<arr.length;i++){
         actualSum +=arr[i];
        }
    
    return expectedSum - actualSum ;
    }
    public static void main(String[] args){
        Missing m1 = new Missing();
      int result = m1.MissingNum(new int[]{1,2,3,5,6,7});
        System.out.print(result);
      }
        
    }


