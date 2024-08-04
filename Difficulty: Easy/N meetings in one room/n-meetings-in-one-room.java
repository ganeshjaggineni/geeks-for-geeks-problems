//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public class Meetings
    {
        int start;
        int end;
        Meetings(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
        //  @Override
        // public String toString()
        // {
        // return start+" "+end+"\t";
        // }
    }
   
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        
        Meetings[] meeting = new Meetings[n];
        for(int i=0;i<n;i++)
        {
            meeting[i] = new Meetings(start[i],end[i]);
            
        }
        // System.out.println(Arrays.toString(meeting)
        Arrays.sort(meeting,Comparator.comparingInt(meeti -> meeti.end));
        int prevMeetEnd = -1;
        int successMeets = 0;
        for(Meetings eachMeet : meeting)
        {
            // System.out.println("start = "+start[i]+" end ="+end[i]);
            if(eachMeet.start > prevMeetEnd)
            {
                successMeets++;
                prevMeetEnd = eachMeet.end;
                
            }
        }
        return successMeets;
    }
}
