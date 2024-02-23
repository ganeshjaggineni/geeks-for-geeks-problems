

//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        
        Arrays.sort(candies);
        ArrayList<Integer> arr = new ArrayList<>();
        int min_amt = 0;
        int max_amt = 0;
        
        for(int i=0,j=N-1;i<=j;i++)
        {
            min_amt += candies[i];
            j = j-K;
        }
         for(int i=N-1,j=0;i>=j;i--)
        {
            max_amt += candies[i];
            j = j+K;
        }
        arr.add(min_amt);
        arr.add(max_amt);
        return arr;
        
    }
}