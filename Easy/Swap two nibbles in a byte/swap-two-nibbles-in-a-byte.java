//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        
        
       int  left_nibble = n&240;
        //swift the left nibble to  4 bits  right
        left_nibble = left_nibble>>4;
        int right_nibble = n&15;
        //swift the right nibble to 4 bits left
        right_nibble = right_nibble<<4;
        
        return left_nibble|right_nibble;
    }
}