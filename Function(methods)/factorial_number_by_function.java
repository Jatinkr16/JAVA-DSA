import java.util.*;

public class factorial_number_by_function {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=n*i;
        }
        return f;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

       int fact= factorial(n);

      System.out.println("Factorial of a number is: "+ fact);
    }
}
