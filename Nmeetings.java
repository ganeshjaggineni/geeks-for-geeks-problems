

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
       int[][] meet = new int[n][2];
       for(int i=0;i<n;i++)
       {
           meet[i][0]=start[i];
           meet[i][1]=end[i];
       }
       Arrays.sort(meet,Comparator.comparingInt(a->a[1]));
       
       int count=1;
       int endtime = meet[0][1];
       int i=1;
       while(i<n)
       {
           if(meet[i][0]>endtime)
           {
           count++;
           endtime=meet[i][1];
           }
           i++;
       }
       return count;
  
    }
}