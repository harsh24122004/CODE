import java.util.Scanner;

public class studentmarks{
    public static void  main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter student name");
        String name= sc.nextLine();
        System.out.println("enter student class");
        String standard= sc.nextLine();
        System.out.println("enter physics marks");
        int ph= sc.nextInt();
        System.out.println("enter bio marks");
        int bio= sc.nextInt();
        System.out.println("enter chem marks");
        int chem= sc.nextInt();
         System.out.println("enter maths marks");
         int maths= sc.nextInt();
         System.out.println("enter english marks");
         int eng= sc.nextInt();
         int total_marks=ph+bio+chem+maths+eng;
         System.out.println("your total marks"+total_marks);
         double avg= (ph+bio+chem+maths+eng)/5;
         System.out.println("your average marks"+avg+"%");


    }
    

}
