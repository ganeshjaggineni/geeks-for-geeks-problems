//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int[] eachRow : mat)
        {
            if(x >= eachRow[0] && x <= eachRow[eachRow.length-1])
                if(doBinarySearch(eachRow,x))
                    return true;
        }
        return false;
    }
    private static boolean doBinarySearch(int[] eachRow,int key)
    {
        int low = 0;
        int high = eachRow.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(key == eachRow[mid])
                return true;
            if(key < eachRow[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
        
    }
}
