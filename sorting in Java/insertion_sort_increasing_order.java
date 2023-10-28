import java.util.*;

public class insertion_sort_increasing_order {
    public static void insertion_sort(int arr[]){
         


        for(int i=1; i<arr.length; i++)
        {
            int currelement=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>currelement)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=currelement;
        }
    }

    public static void printarray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        insertion_sort(arr);
        printarray(arr);
    }
}
