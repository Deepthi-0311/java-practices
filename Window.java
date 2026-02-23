public class Window {
    public static void main(String[] args){
        int arr[] = {1,4,4,4,8};
        int target = 9;
        boolean found = false;
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(i>=2){
                if(sum==target){
                    System.out.print("found");
                    found = true;
                    break;
                }
                else{
                    sum-=arr[i-2];
                }
            }
        }
        if(!found){
            System.out.print("not");
        }
    }
    
}
