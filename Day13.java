public class Day13 {
    //Q1:https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] arr={-1,-1};
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]<=x)
            {
                arr[0]=a[mid];
                low=mid+1;
            }
            else high=mid-1;
        }

        if(arr[0]==x) arr[1]=x;
        else{
            if(low<n&&a[low]>x) arr[1]=a[low];
        }

        return arr;
    }
    //Q2 https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else
            {
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;
    }
    //Q3:https://leetcode.com/problems/search-in-rotated-sorted-array/
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target&&arr[mid]>=target)
                {
                    high=mid-1;
                }
                else low=mid+1;
            }
            else
            {
                if(arr[mid]<=target&&arr[high]>=target)
                {
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }

}
