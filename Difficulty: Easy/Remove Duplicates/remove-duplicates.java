//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
        // code here
        Set<Character> dupSet = new HashSet<>();
        StringBuilder newStr = new StringBuilder();
        for(char ch : str.toCharArray())
        {
            if(!dupSet.contains(ch))
            {
                newStr.append(ch);
                dupSet.add(ch);
            }
        }
        return newStr.toString();
    }
}