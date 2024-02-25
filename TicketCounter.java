class Solution {
    public static int distributeTicket(int N,int K)
    {
        Deque tic_cou = new ArrayDeque<>();
        for(int i=1;i<=N;i++)
        {
            tic_cou.addLast(i);
        }
        int i,j;
        while(tic_cou.size() !=1)
        {
            i = 1;
            while(i<=K && tic_cou.size() != 1)
            {
                tic_cou.removeFirst();
                i++;
            }
            j = 1;
            while(j<=K && tic_cou.size() != 1)
            {
                tic_cou.removeLast();
                j++;
            }
        }
        return (int)tic_cou.getFirst();
        
    }
}