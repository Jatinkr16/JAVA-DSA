import java.util.*;

public class prime_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();

        if(n==2)
        {
            System.out.println("NUmber is prime");
        }
        else
        {
            boolean isprime=true;

            for(int i=2; i<Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                }
            }

            if(isprime==true)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
    }
}
