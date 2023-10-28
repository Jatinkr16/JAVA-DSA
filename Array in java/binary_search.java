import java.util.*;

public class binary_search{
    public static int binsearch(int arr[],int item)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==item)
            {
                return mid;
            }
            if(item>arr[mid])
            {
                low=mid+1;
            }
            if(item<arr[mid])
            {
                high=mid-1;
            }
        }

        return -1;
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
        
        System.out.print("Enter item you want to search:");
        int item=sc.nextInt();

        int k=binsearch(arr,item);

        if(k==-1)
        {
            System.out.println("Item you want to search is not found");
        }
        else
        {
            System.out.println("item is found at index: "+ k);
        }
    }
}