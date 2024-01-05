/*
		Queue Reversal
EasyAccuracy: 77.98%Submissions: 108K+Points: 2
90% Refund available on all premium courses 
Discover How  

banner
Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
6
4 3 1 10 2 6
Output: 
6 2 10 1 3 4
Explanation: 
After reversing the given elements of the queue , the resultant queue will be 6 2 10 1 3 4.
Example 2:

Input:
4
4 3 2 1 
Output: 
1 2 3 4
Explanation: 
After reversing the given elements of the queue , the resultant queue will be 1 2 3 4.
Your Task: You need to complete the function rev that takes a queue as parameter and returns the reversed queue. The printing is done automatically by the driver code.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 ≤ N ≤ 105
1 ≤ elements of Queue ≤ 105

*/

//CODE


//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> rev_stack = new Stack();
        while(q.size() > 0)
        {
           rev_stack.push(q.remove()); 
            
        }
        while(!rev_stack.isEmpty())
        {
            q.add(rev_stack.pop());
        }
        return q;
    }
}