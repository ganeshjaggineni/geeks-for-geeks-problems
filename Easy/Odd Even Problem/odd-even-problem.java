//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        Map<Character,Integer> m = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int x = 0;
        int y = 0;
        // for(Map.Entry<Character,Integer> entry:m.entrySet())
        // {
        //     System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        // }
          for(Map.Entry<Character,Integer> entry:m.entrySet())
        {
                if((entry.getKey()-96)%2 == 0 && entry.getValue()%2 ==0 )
                    x = x+1;
                else if((entry.getKey()-96)%2 !=0 && entry.getValue()%2 != 0)
                    y = y+1;
                
        }
        return (x+y)%2 == 0?new String("EVEN"):new String("ODD");
       
    }
}
