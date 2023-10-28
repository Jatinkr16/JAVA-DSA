import java.util.*;

public class print_reverse_number{
    public static void fun(int n){
        if(n==0){
            return;
        }
       
            System.out.print(n+" ");
            fun(n-1);
        
    }
    public static void main(String args[])
    {
        int n=10;
        fun(n);
    }
}