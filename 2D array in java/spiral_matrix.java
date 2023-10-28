import java.util.*;

public class spiral_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

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

        spiralform(matrix);
    }

    public static void spiralform(int matrix[][])
    {
        int startrow=0;
        int startcoln=0;

        int endrow=matrix.length-1;
        int endcoln=matrix[0].length-1;

        while(startrow<=endrow && startcoln<=endcoln)
        {
            for(int j=startcoln; j<=endcoln; j++)
            {
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1; i<=endrow; i++)
            {
                System.out.print(matrix[i][endcoln]+" ");
            }

             for(int j=endcoln-1; j>=startcoln; j--)
             {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
             }

             for(int i=endrow-1; i>=startrow+1; i--)
             {
                if(startcoln==endcoln)
                {
                    break;
                }
                
                System.out.print(matrix[i][startcoln]+" ");
             }

             startcoln++;
             endcoln--;
             startrow++;
             endrow--;
        }
    }
}