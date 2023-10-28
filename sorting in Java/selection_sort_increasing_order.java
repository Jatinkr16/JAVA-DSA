import java.util.*;

public class selection_sort_increasing_order {
    public static void selectionsort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)  
        {
            int minpos=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minpos]>arr[j])
                {
                   minpos=j;
                }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    
    public static void printarray(int arr[])
    {
        System.out.print("Sorted array is:");
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

        selectionsort(arr);
        printarray(arr);
}
}