

// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
       HashSet set = new LinkedHashSet<>();
       int count = 0;
       for(int i=0;i<n;i++)
       
       {
           set.add(a[i]);
       }
       for(int i=0;i<m;i++)
       {
           if(set.contains(b[i]))
           {
               count++;
               set.remove(b[i]);
           }
       }
       return count;
    }
};