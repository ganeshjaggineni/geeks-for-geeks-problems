//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minRemoval(a);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        // System.out.println(Arrays.deepToString(intervals));
        int i = 0;
        int j = 1;
        int n = intervals.length;
        int removalCnt = 0;
        while(j < n)
        {
            if(intervals[i][1] > intervals[j][0]) //overlap condition
            {
                if(intervals[i][1] > intervals[j][1])// if curr interval end time higher then remove  this
                {
                
                   i = j;
                   removalCnt++;
                }
               else //if next interval remove time higher
               {
                  removalCnt++;
                   
               }
               
                
            }
           else
           {
                i = j;
                
           }
           j++;
        }
        return removalCnt;
    }
}
