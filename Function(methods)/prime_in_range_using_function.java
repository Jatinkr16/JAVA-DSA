import java.util.*;

public class prime_in_range_using_function{
    public static boolean isprime(int n)
    {
        

        if(n==2)
        {
            return true;
        }
        else
        {
            for(int i=2; i<n; i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void isprimerange(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        isprimerange(n);
    }
}
