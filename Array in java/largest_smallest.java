public class largest_smallest {

    public static int largestsmallest(int arr[])
    {
        int larsgest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>larsgest)
            {
                larsgest=arr[i];
            }
           if(arr[i]<smallest)
           {
            smallest=arr[i];
           }
        }

        System.out.println("smallest number is: "+ smallest);
        return larsgest;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};

       int k= largestsmallest(arr);
       System.out.println("largest number is: "+ k);

    } 
}
