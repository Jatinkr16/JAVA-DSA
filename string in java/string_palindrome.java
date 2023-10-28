import java.util.*;

public class string_palindrome{

    public static boolean ispalindrome(String str)

    {
        int k=0;
        for(int i=0; i<str.length()/2; i++)
        {
            int n=str.length();
           if(str.charAt(i)==str.charAt(n-1-i))
           {
               k++;
           }
           else
           {
            System.out.print("String is not palindrome");
            return false;
           }
        }

        System.out.print("String is palindrome.");
        return true;
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string:");
        String str=sc.next();

        ispalindrome(str);
    }
}