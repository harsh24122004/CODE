public class Min{

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
    int min = arr[0];
    for(int i=1;i<arr.length;i++){
        if(min>arr[i])
        min = arr[i];
    }
    System.out.print("Min Element is"+min);

    }
}
int totalSum = n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int missing = totalSum - sum;
        System.out.println("The Missing number is"+missing);