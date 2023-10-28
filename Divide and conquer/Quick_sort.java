import java.util.*;
public class Quick_sort {
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        Quicksort(arr, si, pidx-1);
        Quicksort(arr,pidx+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
          int pivot=arr[ei];
          int i=si-1;

          for(int j=si; j<=ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
          }
          i++;
          int temp=arr[i];
          arr[i]=pivot;
          arr[ei]=temp;
          return i;
    }

    public static void print(int arr[]){
        System.out.print("Sorted array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter elements in array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int si=0;
        int ei=arr.length-1;
        Quicksort(arr,si,ei);
        print(arr);
    }
    
}
