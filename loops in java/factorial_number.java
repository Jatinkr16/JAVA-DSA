import java.util.*;

public class factorial_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number:");
        int n=sc.nextInt();
         int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }

        System.out.print(fact);
    }
}
