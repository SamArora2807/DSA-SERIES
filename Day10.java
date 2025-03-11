import java.util.ArrayList;
import java.util.Arrays;

public class Day10 {
    //Q1:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int pos=1;
        int neg=0;
        for(int i:nums)
        {
            if(i>0)
            {
                arr[pos]=i;
                pos+=2;
            }
            else {
                arr[neg]=i;
                neg+=2;
            }
        }
        return arr;
    }
    // Q2:https://leetcode.com/problems/next-permutation/description/
    void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    void reverse(int arr[],int s,int e)
    {
        while(s<=e)
        {
           swap(arr[s],arr[e]);
           s++;
           e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
        int x=index+1;
        for(x=index+1;x<n;x++)
        {
            if(nums[x]<nums[index])
            {
                swap(nums[x-1],nums[index]);
                break;

            }
            if(x==n-1&&nums[x]>nums[index])
            {
                swap(nums[x],nums[index]);
            }
            reverse(nums,index+1,n-1);
        }
    }
}
