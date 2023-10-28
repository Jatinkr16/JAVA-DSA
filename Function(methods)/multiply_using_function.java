import java.util.*;

public class multiply_using_function {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int prod=product(a,b);
        System.out.println("a*b= "+ prod);
    }

    public static int product(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
}
