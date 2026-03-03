public class SumEven1D{
    public static void main(String[] args){
        int[] arr={3, 6, 9, 12};
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]%2==0){
              count++;  
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Even Count: " + count);
    }
}

   