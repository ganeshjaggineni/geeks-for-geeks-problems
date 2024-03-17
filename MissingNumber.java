

// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        int sum = 0;
        
      for(int i=0;i<n-1;i++)
      {
          sum = sum+array[i];
      }
      int nat_sum = 0;
      nat_sum = n*(n+1)/2;
      return nat_sum-sum;
    }
    
}