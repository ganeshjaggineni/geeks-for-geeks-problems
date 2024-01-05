/*
									Game with String

Given a string s of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of k characters. The value of a string is defined as the sum of squares of the count of each distinct character.
 

Example 1:

Input: s = abccc, k = 1
Output: 6
Explaination:
We remove c to get the value as 12 + 12 + 22
 

Example 2:

Input: s = aabcbcbcabcc, k = 3
Output: 27
Explaination: We remove two 'c' and one 'b'. 
Now we get the value as 32 + 32 + 32.

Your Task:
You do not need to read input or print anything. Your task is to complete the function minValue() which takes s and k as input parameters and returns the minimum possible required value.

 

Expected Time Complexity: O(N+Klog(P))  where N is the length of string and P is number of distinct alphabets and K number of alphabets to be removed 
Expected Auxiliary Space: O(N)

*/
//PROGRAM


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
       Scanner sc = new Scanner(System.in);
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       int result = 0;
       int len = s.length();
       int[] count = new int[26];
       for(int i=0;i<len;i++)
       {
           char ch = s.charAt(i);
           count[ch-'a']++; //string contains only lower case alphabets
       }
       
       //ADDING THE FREQUENCIES INTO PRIORITY QUEUE
       for(int val:count)
       {
           if(val>0)
                pq.offer(val);
       }
       //REMOVING K CHARACTERS
       while(k>0 && !pq.isEmpty())
       {
           int top = pq.poll();
           if(top-1 > 0)
           {
               pq.offer(top-1);
           }
           k--;
       }
       //calculating the result
       while(!pq.isEmpty())
       {
           int charfreq = pq.poll();
           result = result+charfreq*charfreq;
       }
       return result;
    }
}