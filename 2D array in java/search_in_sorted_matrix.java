import java.util.*;

public class search_in_sorted_matrix {

    public static boolean staircase(int matrix[][], int key) {
        int row = 0, column = matrix[0].length - 1;

        while (row <= matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.print("Item found at index:" + "(" + row + "," + column + ")");
                return true;
            }

            else if (key<matrix[row][column]) {

                column--;
            } else {
                row++;
            }
        }

        System.out.print("Item not found!");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row:");
        int n = sc.nextInt();

        System.out.print("Enter the number of column:");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.print("Enter the elements in matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the key you want to search:");
        int key = sc.nextInt();

        staircase(matrix, key);
    }
}
