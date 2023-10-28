import java.util.*;

public class diagonal_sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter the number of row:");
        int n = sc.nextInt();

        System.out.print("Enter the number of column:");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.print("Enter elements in matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        int leftdig=0;
        int rightdig=0;
        if(n==m)
        {
            // for(int i=0; i<n; i++)
            // {
            //     for(int j=0; j<m; j++)
            //     {
            //         if(i==j)
            //         {
            //            leftdig+=matrix[i][j];
            //         }
            //         else if(i+j==matrix.length-1)
            //         {
            //             rightdig+=matrix[i][j];
            //         }
            //     }

              
            // }
            // int sum=leftdig+rightdig;
            // System.out.print(sum);

            for(int i=0; i<n; i++)
            {
                leftdig+=matrix[i][i];

                if(i!=matrix.length-1-i)
                rightdig+=matrix[i][matrix.length-1-i];
            }
            int sum=leftdig+rightdig;
             System.out.print(sum);
        }
    }
}
