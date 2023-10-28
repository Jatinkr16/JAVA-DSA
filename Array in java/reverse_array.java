public class reverse_array {
    public static void reversearray(int numbers[])
    {
        int i;
        int n=numbers.length;
        for(i=0; i<numbers.length/2; i++)
        {
            int temp=numbers[n-1-i];
            numbers[n-1-i]=numbers[i];
            numbers[i]=temp;
        }
    }

    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6};

        reversearray(numbers);

        for(int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
