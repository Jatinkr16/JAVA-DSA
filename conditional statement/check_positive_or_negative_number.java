import java.util.*;

public class check_positive_or_negative_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
