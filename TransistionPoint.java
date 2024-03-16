

class Solution {
    int transitionPoint(int arr[], int n) {
        int index = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                index = i;
                break;
            }
        }
        return index;
    }
}