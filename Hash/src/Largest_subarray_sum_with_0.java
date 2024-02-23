import java.util.HashMap;

public class Largest_subarray_sum_with_0 {
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=0;
        int i=0;
        int u=0;

        for(int j=0; j<arr.length; j++){
            sum=sum+arr[j];
            if(map.containsKey(sum)){
                len=Math.max(sum,map.get(sum));
                i=map.get(sum)+1;
                u=j;
            }
            else{
                map.put(sum,j);
            }
        }

        System.out.println("maximum subarray sum with 0 length=> "+len);
        System.out.println("subarray with 0 from idx "+i+" to "+u);
    }
}
