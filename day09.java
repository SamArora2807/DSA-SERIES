import java.util.HashMap;

public class day09 {
//Q1:https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 1; i < n; i++) {
            mpp.put(arr[i - 1], i - 1);
            int moreNeeded = target - arr[i];
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }


        }
        return ans;
    }
    //Q2 https://leetcode.com/problems/sort-colors/description/
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        for(int i:nums)
        {
            arr[i]++;
        }
        for(int i=0;i<arr[0];i++)
        {
            nums[i]=0;
        }
        for(int i=arr[0];i<arr[1]+arr[0];i++)
        {
            nums[i]=1;
        }
        for(int i=arr[1]+arr[0];i<arr[2]+arr[1]+arr[0];i++)
        {
            nums[i]=2;
        }
    }
    //Q3 https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0
    public int pairWithMaxSum(int arr[]) {
        int n=arr.length;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<n-1;i++)
        {
            sum=arr[i]+arr[i+1];
            maxsum=Math.max(sum,maxsum);
        }


        return maxsum;
    }


}
