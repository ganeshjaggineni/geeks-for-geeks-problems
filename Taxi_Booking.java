

class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        int min = Integer.MAX_VALUE;
        int min_dist  = 0;
       for(int i=0;i<N;i++)
       {
           min_dist = (Math.abs(cur-pos[i]))*time[i];
           if(min_dist < min)
            min = min_dist;
       }
       return min;
    }
}
        