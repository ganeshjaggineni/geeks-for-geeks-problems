//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        int len = 0;
        Set<Character> set = new HashSet<>();
        for(char ch:str.toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
            {
                len++;
                 set.add(ch);
            }
            
        }
        if(len < 26)
            return false;
        
        if(k >= 26-set.size())
            return true;
        return false;
            
    }
}