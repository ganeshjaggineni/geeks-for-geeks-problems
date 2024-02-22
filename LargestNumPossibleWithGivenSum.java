

//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
       StringBuilder ans = new StringBuilder();
       
      if(S>9*N ||(N>1 && S==0))
      {
      return "-1";
      }
       for(int i=0;i<N;i++)
       {
           if(S>9)
           {
               S=S-9;
               ans.append("9");
           }
           else
           {
               ans.append(S);
               S=0;
           }
       }
       return ans.toString();
     
    }
}