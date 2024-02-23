


class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        StringBuilder res = new StringBuilder();
        if(sum>n*9)
            return "-1";
        for(int i=0;i<n;i++)
        {
            if(sum>9)
            {
                res.append("9");
                sum -= 9;
            }
            else
            {
                res.append(sum);
                sum = 0;
            }
        }
        
        return res.toString();
    }
}
