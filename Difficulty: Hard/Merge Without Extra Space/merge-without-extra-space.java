//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            System.out.println(str);
            str = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        int c[] = new int[n+m];
        int idx = 0;
        while(i < n && j < m)
        {
            if(a[i] <= b[j])
            {
                // System.out.println("a[i] = "+a[i]+" b[i] = "+b[i]);
                c[idx++] = a[i++];
            }
            else
            {
                c[idx++] = b[j++];
            }
        }
        while(i < n)
        {
            c[idx++] = a[i++];
        }
        while(j < m)
        {
            c[idx++] = b[j++];
        }
        // System.out.println("c = "+Arrays.toString(c));
        for(int val=0;val<n;val++)
        {
            a[val] = c[val];
        }
        for(int val=0;val<m;val++)
        {
            b[val] = c[n+val];
        }
    }
}