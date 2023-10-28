import java.util.*;

public class trapped_rainwater_code {
    public static int trappedrainwater(int height[])
    {
        int n=height.length;

        //calculate left max element
        int leftmax[]=new int[n];
         leftmax[0]=height[0];
        for(int i=1; i<n; i++)
        {
            if(leftmax[i-1]>height[i])
            {
                leftmax[i]=leftmax[i-1];
            }
            else
            {
                leftmax[i]=height[i];
            }
        }

        // calculate right max element

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];

        for(int i=n-2; i>=0; i--)
        {
            if(rightmax[i+1]>height[i])
            {
                rightmax[i]=rightmax[i+1];

            }
            else
            {
                rightmax[i]=height[i];
            }
        }

        //loop
        int trappedwater=0;
        int waterlevel;
        for(int i=0; i<n; i++)
        {
            // calculate water level which is minimum of rightmax piller and left max piller
             if(leftmax[i]<rightmax[i])
             {
                waterlevel=leftmax[i];
             }
             else
             {
                waterlevel=rightmax[i];
             }

             // trapped water is equal to waterlevel - height of that piller
             trappedwater=trappedwater + waterlevel-height[i];

        }

        return trappedwater;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int height[]=new int[n];

        System.out.print("Enter elements in array:");
        for(int i=0; i<n; i++)
        {
           height[i]=sc.nextInt();
        }

        int k=trappedrainwater(height);

        System.out.println("Total trapped rain water:"+k);

    }
}
