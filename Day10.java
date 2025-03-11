import java.util.ArrayList;

public class Day10 {
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
}
