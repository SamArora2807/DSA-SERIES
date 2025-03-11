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
    void reverse(int arr[],int s,int e)
    {
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(nums,0,n-1);
            return;
        }

        for(int x=n-1;x>index;x--)
        {
            if(nums[x]>nums[index])
            {
                int temp=nums[x];
                nums[x]=nums[index];
                nums[index]=temp;
                break;

            }
        }
        reverse(nums,index+1,n-1);
    }
}
