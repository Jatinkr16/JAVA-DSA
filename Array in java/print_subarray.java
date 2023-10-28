public class print_subarray {
    public static void subarray(int numbers[])
    {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<=numbers.length; j++)
            {
                for(int k=i; k<j; k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};

        subarray(numbers);
    }
}
