

class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
      
      if(n==0)
        return true;
        
     for(int i=0;i<m;i++)
     {
         if(seats[i] == 0)
         {
             if(   (i == 0 || seats[i-1] == 0)  && (i==m-1 || seats[i+1] == 0)  )
             {
                 n--;
                 seats[i] = 1;
                 
                 
             }
             if(n==0)
                return true;
         }
     }
     return false;
    }
}
        