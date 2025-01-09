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
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int cnt = 0;
        int[] prefixLeftMax = new int[n];
        int[] prefixRightMax = new int[n];
        prefixLeftMax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            prefixLeftMax[i] = Math.max(prefixLeftMax[i-1],arr[i]);
        }
        
        prefixRightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            prefixRightMax[i] = Math.max(prefixRightMax[i+1],arr[i]);
        }
      
        for(int i=0;i<n;i++)
        {
            int waterHold = Math.min(prefixLeftMax[i],prefixRightMax[i]);
            cnt += waterHold - arr[i];
        }
        return cnt;
    }
        
        //BruteForce Method
        /*
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int leftMax = findLeftMax(i,arr);
            int rightMax = findRightMax(i,arr);
            int waterHold = Math.min(leftMax,rightMax);
            cnt += waterHold - arr[i];
        }
        return cnt;
    }
    private static int findLeftMax(int stopIdx,int[] arr)
    {
        int leftMax = 0;
        for(int i=0;i<=stopIdx;i++)
        {
            leftMax = Math.max(leftMax,arr[i]);
        }
        return leftMax;
    }
    private static int findRightMax(int startIdx,int[] arr)
    {
        int stopIdx = arr.length;
        int rightMax = 0;
        for(int i=startIdx;i<stopIdx;i++)
        {
            rightMax = Math.max(rightMax,arr[i]);
        }
        return rightMax;
    }
    */
}
