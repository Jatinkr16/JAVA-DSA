import java.util.*;

public class reverse_of_a_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        int lastdigit;
        int reverse=0;


        while(n>0)
        {
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }

        System.out.println("reverse iS: "+reverse);

    }
}
