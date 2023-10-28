public class linear_search {

    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7};
        int key=4;

        int k=linearsearch(numbers,key);

        if(k==-1)
        {
              System.out.println("Not found");

        }
        else
        {
            System.out.println("element found at index: "+ k);
        }
    }
}
