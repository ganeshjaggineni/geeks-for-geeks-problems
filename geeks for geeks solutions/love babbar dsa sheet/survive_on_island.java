

//User function Template for Java

class Solution{
    static int minimumDays(int S, int N, int M){
      int survive_days = S;
      int each_day_buy = N;
      int each_day_eat = M;
      
      //one week contains only one sunday
      //he can buy 6 days a week and a week contain 7 days
      int buy_days = S-S/7;
      int days = (survive_days*each_day_eat)/each_day_buy;
      
      if(N < M || buy_days*each_day_buy < survive_days*each_day_eat)
        return -1;
     else
     {
         //he is possible  to survive. Now, our task is no of days he can buy food
         if( (survive_days*each_day_eat)%each_day_buy !=0 )
         {
             days++;
         }
         return days;
     }
     
      
    }
}