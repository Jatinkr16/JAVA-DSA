public class max_subarray_sum_using_kadanes_algorithm {
    public static void  maxsubarraysum(int numbers[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++)
        {
            currsum=currsum+numbers[i];

            if(currsum<0)
            {
                currsum=0;
            }
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
        }
        System.out.println("maximum subarray sum is:"+maxsum);
         currsum=0;
        if(maxsum==0)
        {
            maxsum=Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++)
            {
                currsum=currsum+numbers[i];
                if(currsum>maxsum)
                {
                    maxsum=currsum;
                }
            }
        }

        System.out.println("maximum subarray sum is:"+maxsum);
    }
     
    public static void main(String args[])
    {
        int numbers[]={-1,2,-6,-1,-3};

        maxsubarraysum(numbers);
    }

}
