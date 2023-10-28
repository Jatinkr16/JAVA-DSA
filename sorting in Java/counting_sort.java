import java.util.*;

public class counting_sort {
    public static void countingsort(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
             largest=Math.max(largest,arr[i]);
        }
        
        int count[]=new int[largest+1];

        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }
 
        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;

            }
        }

    }

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter elements in array:");
        for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }

        countingsort(arr);
        printArr(arr);
    }
}
