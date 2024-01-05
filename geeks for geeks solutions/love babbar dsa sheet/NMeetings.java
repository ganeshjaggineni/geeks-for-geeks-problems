package lovebabbardsa;

import java.util.*;

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
    @Override
    public String toString() {
        return "Meeting{" +
                "start=" + start +
                ", end=" + end +
                ", pos=" + pos +
                '}';
    }

}
public class NMeetings {

	public static void MaxMeetings(ArrayList<Meeting> al,int size)
	{
		ArrayList<Integer> res = new ArrayList<>();
		int prev_meet_time = 0;
		al.sort(Comparator.comparingInt(Meeting -> Meeting.end));
		//adding first meeting in result list
		//because atleast one meeting should be done in meeting room
		res.add(al.get(0).pos);
		//update prev_meet_time to first meeting end time
		prev_meet_time=al.get(0).end;
		//check next meeting to be selected
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i).start > prev_meet_time)
			{
				res.add(al.get(i).pos);
				//update prev_meet_time to current meeting end time
				prev_meet_time = al.get(i).end;
			}
		}
		System.out.println("\nAfter sorting based on end time");
		for(Meeting me:al)
		{
			System.out.println(me);
		}
		System.out.println("\nMeeting numbers :");
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i)+1);
		}
		

	}
	public static void main(String args[])
	{
//		int s[] = {1,123,0,5,8,5};
//		int f[] = {2,124,6,7,9,9};
		int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924}; 
		int f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252}; 
		
		ArrayList<Meeting> meet = new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			Meeting obj = new Meeting(s[i],f[i],i);
			meet.add(obj);
		}
		// to print array list meet to see class objects in it
		for(Meeting me:meet)
		{
			System.out.println(me);
		}
		//calling MaxMeetings methods to find no.of meeting to be held
		MaxMeetings(meet,meet.size());
//		System.out.println("After Comparing");
		
	}
}
