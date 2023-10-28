import java.util.*;

public class merge_sort{
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        i=si;
        for(k=0; k<temp.length; k++){
            arr[i]=temp[k];
            i++;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter elements in array:");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int si=0;
        int ei=arr.length-1;
        mergesort(arr,si,ei);
        print(arr);
    }
}