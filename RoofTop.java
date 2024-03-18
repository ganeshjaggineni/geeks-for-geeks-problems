


class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        int steps = 0;
        int max_steps = 0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]<A[i+1])
            {
               steps++;
               if(steps>max_steps)
               {
                   max_steps = steps;
               }
            }
            else
            {
                steps = 0;
            }
            
        }
        return max_steps;
    }
    
}