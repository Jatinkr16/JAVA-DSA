import java.util.*;

public class Bubble_sort_increasing_order{

    public static void Bubblesort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int swap=0;
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;

                }

                
            }
            if(swap==0)
            {
                break;
            }
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

        Bubblesort(arr);
        printarray(arr);
    }
}