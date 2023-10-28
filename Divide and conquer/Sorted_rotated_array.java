import java.util.*;
public class Sorted_rotated_array {
    public static void rotarrsearch(int arr[],int item){
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high && arr[mid]!=item){
            if(arr[low]<arr[mid]){
                if(item>=arr[low] && item<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
           else if(arr[high]>arr[mid]){
                if(item>arr[mid] && item<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            mid=(low+high)/2;
        }

        if(arr[mid]==item){
            System.out.println("item found at index:"+ mid);
        }
        else{
            System.out.println("item not found");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter elements in array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter item you want to search:");
        int item=sc.nextInt();
        rotarrsearch(arr,item);
        
    }
}
