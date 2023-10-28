public class max_subarray_sum_prefix {
    
        public static void maxsubarraysum(int numbers[])
        {
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int[numbers.length];

            prefix[0]=numbers[0];

            for(int i=1; i<numbers.length; i++)
            {
                prefix[i]=prefix[i-1]+numbers[i];
            }

            for(int i=0; i<numbers.length; i++)
            {
                for(int j=i+1; j<numbers.length; j++)
                {
                  currsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                  System.out.print(currsum+" ");
                  if(currsum>maxsum)
                  {
                    maxsum=currsum;
                  }
                }
            }

            System.out.println();
            System.out.println("maximum subarray sum is:"+maxsum);
        }
    
        public static void main(String args[])
        {
            int numbers[]={1,-2,6,-1,3};
    
            maxsubarraysum(numbers);
        }
    }
    



