public class missing {
    public static void main(String[] args){
        int arr[]={0,1,4,5};
        int sum=0;
        int n = arr.length;
        int totalSum = n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int missing = totalSum-sum;
        System.out.println("The Missing number is"+missing);
    }
}