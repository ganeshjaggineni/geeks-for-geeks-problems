
class Meeting
{
    int start;
    int end;
    int pos;
    Meeting(int start,int end,int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
    
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Meeting> meet = new ArrayList<>();
        // ArrayList<Integer> res = new ArrayList<>();
        int count = 1;
        int prev_time = 0;
      for(int i=0;i<n;i++)
      {
          Meeting obj = new Meeting(start[i],end[i],i);
          meet.add(obj);
      }
      meet.sort(Comparator.comparingInt(Meeting->Meeting.end));
    //   res.add(meet.get(0).pos);
      prev_time = meet.get(0).end;
      for(int i=1;i<n;i++)
      {
          if(meet.get(i).start > prev_time)
          {
            //   res.add(meet.get(i).pos);
              prev_time = meet.get(i).end;
              count++;
          }
      }
      return count;
      
    }
    
}