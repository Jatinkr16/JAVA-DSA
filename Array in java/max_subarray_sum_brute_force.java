public class max_subarray_sum_brute_force {
        public static void maxsubarraysum(int numbers[])
        {
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++)
            {
                for(int j=i; j<=numbers.length; j++)
                {
                    currsum=0;

                    for(int k=i; k<j; k++)
                    {
                      
                      currsum=currsum+numbers[k];
                      System.out.println(currsum);
                    }
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
            int numbers[]={500,4,6,8,10};
    
            maxsubarraysum(numbers);
        }
    }
    

