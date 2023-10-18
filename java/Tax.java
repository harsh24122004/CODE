import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary");
        int n=sc.nextInt();
        if(n==10000){
            System.out.println("no tax");
        }
        if(n > 10000 &n< 20000){
            int tax=(n*5)/100;
            int net=n-tax;
            System.out.println("");
        }
    }
    
}
