import java.util.*;

public class multiplication_table {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number:");
        int n=sc.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
