import java.util.*;

public class check_age_if_else{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();

        if(age>=18)
        {
            System.out.println("ADULT");

        }
        if(age>=13 && age<18)
        {
            System.out.println("teenager");

        }
        else
        {
            System.out.println("NOT adult");
        }
    }
}