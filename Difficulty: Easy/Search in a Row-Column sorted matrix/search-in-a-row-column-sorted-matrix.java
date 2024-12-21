//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }

            int x = sc.nextInt();

            if (new Solution().matSearch(mat, x))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
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