import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    if(n%4==0){
        System.out.println("given year is leapyear");
        if(n%100==0){
            System.out.println("given year is leapyear");
            if(n%400==0){
                System.out.println("given year is leapyear");
            }else{
                System.out.println("given year is not leapyear");
            }
            
        }else{
            System.out.println("given year is not leapyear");
        }
    }else{
        System.out.println("given year is not leapyear");
    }
    }
    
}
