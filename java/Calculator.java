import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS");       
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("ENTER THE OPERATION NUMBER:\n1.ADD\n 2.SUBTRACT\n 3.MULTIPLICATION\n 4.DIVIDATION\n 5.MODULO");
        int ch=s.nextInt();
        switch(ch){
            case 1:
            System.out.println("SUM OF TWO NUMBERS IS="+(n1+n2));
            break;
            case 2:
            System.out.println("DIFFERENCE OF TWO NUMBERS="+(n1-n2));
            break;
            case 3:
            System.out.println("MULTIPLICATION OF TWO NUMBERS="+(n1*n2));
            break;
            case 4:
            System.out.println("DIVIDATION OF TWO NUMBERS="+(n1/n2));
            break;
            case 5:
            System.out.println("MODULO OF NUMBERS="+(n1%n2));
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
    }
}
