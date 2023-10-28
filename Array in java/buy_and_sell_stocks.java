import java.util.*;

public class buy_and_sell_stocks {
    public static int buyAndsellstocks(int prices[])
    {
       int buyprice=Integer.MAX_VALUE;
       int maxprofit=0;
       
       for(int i=0; i<prices.length; i++)
       {
           if(buyprice<prices[i])
           {
             int profit=prices[i]-buyprice;
             maxprofit=Math.max(maxprofit,profit);
           }
           else
           {
             buyprice=prices[i];
           }
       }

       return maxprofit;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
         
        int prices[]=new int[n];
        System.out.print("Enter elements in array:");
        for(int i=0; i<n; i++)
        {
            prices[i]=sc.nextInt();
        }

        int profit=buyAndsellstocks(prices);

        System.out.println("maximum profit is:"+profit);
    }
}
