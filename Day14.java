public class Day14 {
    //Q1:https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root
    //used binary search and find out the sqrt (compared mid*mid with given number)
    //TC=O(logN) SC=O(1)
    int floorSqrt(int n) {
        if(n==1) return 1;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid*mid==n) return mid;
            if(mid*mid<n)
            {
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
    //Q2:https://leetcode.com/problems/koko-eating-bananas/description/
    //made a function to check if monkey can eat all bananas with the speed(which is tried using mid) and then used binary search to find the minimum speed
    //TC=O(NlogN) SC=O(1)
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles) max=Math.max(max,i);
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(canEatAll(piles,mid,(long)h))
            {
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
    Boolean canEatAll(int[] piles,int k,long h)
    {
        long hrs=0;
        int n=piles.length;
        for(int i=0;i<n;i++)
        {
            if(piles[i]<=k) hrs+=1;
            else
            {
                if(piles[i]%k==0) hrs+=(long)(piles[i]/k);
                else hrs=hrs+(long)(piles[i]/k+1);
            }
        }
        return hrs<=h;
    }
    //Q3:https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
    // made another function to check the sum by the divisor(which is tried using mid) is less than the threshold or not and find the minimum divisor
    //TC=O(NlogN) SC=O(1)
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i:nums)
        {
            max=Math.max(i,max);
        }
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPoss(nums,threshold,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;

    }
    Boolean isPoss(int[] nums, int threshold,int i)
    {
        int sum=0;
        for(int x:nums)
        {
            sum+=Math.ceilDiv(x,i);
        }
        return sum<=threshold;
    }
}
