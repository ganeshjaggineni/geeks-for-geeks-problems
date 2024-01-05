

// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        int numbers[] = {1,2,5,10,20,50,100,200,500,2000};
        int n = numbers.length;
      Vector deno = new Vector<>();
      for(int i=n-1;i>=0;i--)
      {
          while(N>=numbers[i])
          {
              deno.addElement(numbers[i]);
              N=N-numbers[i];
              
          }
      }
      return deno;
      
    }
}