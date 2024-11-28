//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends




class Solution {
    public int myAtoi(String s) {
        // Your code here
        long ans = 0;
        int n = s.length();
        boolean minus = false;
        int idx = 0;
       while(idx <n && s.charAt(idx) == ' ')
            idx++;
        // System.out.println("white idx = "+idx);
        
        if(idx < n && s.charAt(idx) == '-')
        {
            minus = true;
            idx++;
           
        }
        else if(idx <n && s.charAt(idx) == '+')
        {
            idx++;
        }
        // System.out.println("minus = "+minus);
        
        for(int i=idx;i<n;i++)
        {
           
           
            if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9)
            {
                
                ans = ans*10 + s.charAt(i)-'0';
                // System.out.println("ans at each = "+ans);
            }
            else
                break;
        }
        // System.out.println("ans = "+ans);
        if(minus)
            ans = ans*-1;
        if(ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
        {
            
        
                return (int)ans;
        }
        
      
    }
}