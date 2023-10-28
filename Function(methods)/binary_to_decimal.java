import java.util.*;

public class binary_to_decimal {
    public static void bintoprim(int n)
    {
          int mynum=n;
          int pow=0;
          int dec=0;

          while(n>0)
          {
            int lastdig=n%10;
            dec=dec+(lastdig*(int)Math.pow(2,pow));
             n=n/10;
            pow++;
          }

          System.out.println("Decimal no. of  "+ mynum + " is "+dec);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        bintoprim(n);
    }
}
