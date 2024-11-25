//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n = arr.length;
        int totalSum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        
        int currMinSum = 0;
        int currMaxSum = 0;
        for(int i=0;i<n;i++)
        {
            totalSum += arr[i];
            //kaden's for minimum subarray sum
            currMinSum += arr[i];
            minSum = Math.min(minSum,currMinSum);
            if(currMinSum > 0)
            {
                currMinSum = 0;
            }
            //kaden's for maximum subarray sum
            currMaxSum += arr[i];
            maxSum = Math.max(maxSum,currMaxSum);
            if(currMaxSum < 0 )
            {
                currMaxSum = 0;
            }
        }
        int circularSubArrSum = totalSum - minSum;
        if(circularSubArrSum == 0)
            return maxSum;
        return Math.max(maxSum,circularSubArrSum);
    }
}
