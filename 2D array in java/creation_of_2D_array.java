import java.util.*;
import java.io.*;

public class creation_of_2D_array{

    public static boolean search(int matrix[][],int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("Item found at"+ "("+i +","+ j+")");
                    return true;
                }
            }
        }

        System.out.print("Item not found");
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][4];

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The output in matrix format is:");
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the key you wnat to search:");

        int key=sc.nextInt();

        search(matrix,key);

       


    }
}