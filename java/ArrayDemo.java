package Arrays;

public class ArrayDemo{

    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int[] arr2 = {1,2,3};
        int dy[] = new int[6];
        for(int i=0;i<dy.length;i++){
            dy[i] = sc.nextInt();
        }
        for(int i=0;i<dy.length;i++){
            System.out.print(dy[i]);

        }
    }
    
}