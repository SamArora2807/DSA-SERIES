public class day08 {
    //Q1 https://leetcode.com/problems/move-zeroes/description/
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
    //Q2 https://leetcode.com/problems/rotate-array/description/
    public void rotate(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        k=k%(j+1);
        reverse(nums,i,j-k);
        reverse(nums,j-k+1,j);
        reverse(nums,i,j);
    }
    static void reverse(int[] arr,int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

    }
}
