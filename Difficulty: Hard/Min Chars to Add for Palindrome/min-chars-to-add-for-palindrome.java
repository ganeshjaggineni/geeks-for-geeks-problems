//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Write your code here
    int n = s.length();
    String revStr = new StringBuilder(s).reverse().toString();
    String str = s + "$" + revStr;
    
      int[] lps = constructLps(str);
    //   System.out.println(Arrays.toString(lps));
      return n-lps[lps.length-1];
    }
    private static int[] constructLps(String s)
    {
        // System.out.println("string =  "+s);
        int j = 1;
        int len = 0;
        int n = s.length();
        int lps[] = new int[n];
        while(j<n)
        {
           if(s.charAt(j) == s.charAt(len))
           {
            //   System.out.println("chara at j "+s.charAt(j));
            // System.out.println("chara at j "+s.charAt(len));
                len++;
               lps[j++] = len;
            //   System.out.println(Arrays.toString(lps));
          }
           else
           {
               if(len != 0)
               {
                   len = lps[len-1];
                //   System.out.println("j > 0 "+len);
               }
               else
               {
                    lps[j] = 0;
               j++;
               }
           }
           
        }
        return lps;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.nextString();
            System.out.println(Solution.minChar(s));

            System.out.println("~");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException {
            while (!st.hasMoreTokens()) read();
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends