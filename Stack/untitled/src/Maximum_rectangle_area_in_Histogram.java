import java.util.Stack;

public class Maximum_rectangle_area_in_Histogram {

    public static void MaxArea(int arr[]){
        int maxarea=0;
        int nsl[]=new int[arr.length]; // next smaller  left
        int nsr[]=new int[arr.length]; // next smaller  right

        Stack<Integer> s=new Stack<>();

        // calculate next smaller right

        for(int i=arr.length-1; i>=0; i--){
            int currheight=arr[i];

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // calculate next smaller left
        s=new Stack<>();
        for(int i=0; i<arr.length; i++){
            int currheight=arr[i];

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // maxarea-> width=j-i-1=nsr[]-nsl[]-1

        for(int i=0; i<arr.length; i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
           int currarea=height*width;
            maxarea=Math.max(currarea,maxarea);
        }

        System.out.println(maxarea);
    }
    public static void main(String args[]){
        int height[]={2,1,5,6,2,3};

        MaxArea(height);

    }
}
