// Given the Binary Array arr[].
// The task is return the count of the Max_Consecutive ones.

// Example:
// arr[]=[1,1,1,0,0,1,1,1,1,0,0]
// output:4

 public int findMaxConsecutiveOnes(int[] arr) {
        int ans=0;
        int n=arr.length;
        int cur=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                cur++;
            }
            else
            {
                cur=0;
            }
            ans=Math.max(ans,cur);
        }
        return ans;
    }

// Time Complexity:O(n)
// Space Complexity:O(1)