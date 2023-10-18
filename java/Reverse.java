import java.util.Scanner;

class Reverse{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=s.nextInt();
        int temp=n;
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
            System.out.println("Reverse of a number is:"+r);
        }
        }