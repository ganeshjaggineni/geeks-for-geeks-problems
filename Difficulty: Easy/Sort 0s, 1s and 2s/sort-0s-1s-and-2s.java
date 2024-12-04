//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int cnt_zero = 0,cnt_one = 0,cnt_two = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
                cnt_zero++;
            else if(arr[i] == 1)
                cnt_one++;
            else
                cnt_two++;
        }
        int idx = 0;
        while(cnt_zero-- > 0)
        {
            arr[idx++] = 0;
        }
         while(cnt_one-- > 0)
        {
            arr[idx++] = 1;
        }
         while(cnt_two-- > 0)
        {
            arr[idx++] = 2;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends