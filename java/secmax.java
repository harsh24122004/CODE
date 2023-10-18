public class Secmax {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
        if(max<arr[i])
        max = arr[i];
    }
    for(int j=0; j<arr.lenght;j++){
        if(secmax<arr[j] && arr[j]!=max)
    secmax=arr[j];
    }
    System.out.print("Max Element is"+secmax);
    
    }
}