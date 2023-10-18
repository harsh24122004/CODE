import java.util.Scanner;

public class salary{
    public static void  main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your basic salary");
        double bs=sc.nextDouble();
        double hra=(30*bs)/100;
        double ta=(20*bs)/100;
        double da=(10*bs)/100;
        double pf=1500;
        double net_salary=bs+hra+da+ta-pf;
        System.out.println(net_salary);
    }

    
}
