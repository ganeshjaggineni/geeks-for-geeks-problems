//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            // Creating an object of class Rotate
            Solution obj = new Solution();

            // calling areRotations method
            // of class Rotate and printing
            //"1" if it returns true
            // else "0"
            if (obj.areRotations(s1, s2)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if two strings are rotations of each other or not.
    public boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length())
            return false;
        int[] lps = createLps(s2.length(),s2);
        String str = s1+s1;
        int len = 0;
        for(int i=0;i<str.length();)
        {
           
            if(s2.charAt(len) == str.charAt(i))
            {
                len++;
                i++;
                
            }
            else
            {
               
                if(len != 0)
                {
                    len = lps[len-1];
                
                }
                else
                    i++;
               
            }
             if(len >= s2.length())
                return true;
                
        }
        return false;
        
        
    }
    private static int[] createLps(int n,String s2)
    {
        int j = 1;
        int len = 0;
        int[] lps = new int[n];
        lps[0] = 0;
        while(j < n)
        {
            if(s2.charAt(j) == s2.charAt(len))
            {
                len++;
                lps[j] = len;
                j++;
            }
            else
            {
                if(len == 0)
                    lps[j] = 0;
                else
                    len = lps[j-1];
                j++;
            }
        }
        return lps;
    }
}