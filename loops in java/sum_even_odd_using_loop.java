import java.util.*;

public class sum_even_odd_using_loop{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
         int sumeven=0;
         int sumodd=0;
         int choice;

        do
        {
            System.out.print("Enter your number:");
            int n=sc.nextInt();

            if(n%2==0)
            {
                sumeven=sumeven+n;

            }
            else
            {
                sumodd=sumodd+n;
            }
            
            System.out.println("Enter your choice ? 1. for continue : 0. for exit:");
            choice=sc.nextInt();



        }while(choice==1);

        System.out.println("sum of even "+sumeven);
        System.out.println("sum of odd "+sumodd);
     }
}