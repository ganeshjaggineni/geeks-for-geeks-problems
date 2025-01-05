//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        HashMap<Character,Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;
        while(right < n)
        {
            char ch = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch) > 1)
            {
                char leftCh = s.charAt(left);
                freq.put(leftCh,freq.get(leftCh)-1);
                if(freq.get(leftCh) == 0)
                {
                   freq.remove(leftCh); 
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}