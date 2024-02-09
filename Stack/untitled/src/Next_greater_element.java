import java.util.Stack;

public class Next_greater_element {

    public static void FindnextGreater(int arr[],int nextGreater[]){
        Stack<Integer> s=new Stack<>();

        for(int i= arr.length-1; i>=0; i--){
            int currElement=arr[i];

            while (!s.isEmpty() && s.peek()<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else {
                nextGreater[i]=s.peek();
            }
            s.push(currElement);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];

        FindnextGreater(arr,nextGreater);

        for(int i=0 ; i<nextGreater.length; i++){
            System.out.println(nextGreater[i]);
        }
    }
}
