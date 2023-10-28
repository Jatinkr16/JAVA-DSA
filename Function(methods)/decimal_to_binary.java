import java.util.*;

public class decimal_to_binary{

    public static void dectobin(int n)
    {
        int mynum=n;
        int pow=0;
        int binary=0;
        
        while(n>0)
        {
            int rem=n%2;
            binary=binary+rem*(int)Math.pow(10,pow);
            n=n/2;
            pow++;
        }

         System.out.println("binary number of "+ mynum +"= "+binary);


    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the decimal number:");
          int n=sc.nextInt();
          dectobin(n);
    }
}