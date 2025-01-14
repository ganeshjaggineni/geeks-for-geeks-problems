//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefixLeftProd = new int[n];
        int[] prefixRightProd = new int[n];
        prefixLeftProd[0] = arr[0];
        int[] res = new int[n];
        for(int i=1;i<n;i++)
        {
            prefixLeftProd[i] = prefixLeftProd[i-1]*arr[i];
        }
        
        int rightProd = 1;
        for(int i=n-1;i>=0;i--)
        {
           rightProd *= arr[i];
           prefixRightProd[i] = rightProd;
        }
        
       
        res[0] = prefixRightProd[1];
        res[n-1] = prefixLeftProd[n-2];
        int idx = 1;
        for(int i=1;i<n-1;i++)
        {
            int ans = prefixLeftProd[i-1] * prefixRightProd[i+1];
            res[idx++] = ans;
            
        }
        return res;
    }
}
