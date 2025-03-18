public class Day16 {
    //Q1: https://leetcode.com/problems/find-a-peak-element-ii/description/
    public int[] findPeakGrid(int[][] mat) {
        int n= mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;

        int row=-1;

        while(low<=high)
        {
            int max=Integer.MIN_VALUE;
            int mid=(low+high)/2;
            for(int i=0;i<n;i++)
            {
                if(mat[i][mid]>max) {
                    max=mat[i][mid];
                    row=i;
                }
            }
            int right=mid+1<m?mat[row][mid+1]:-1;
            int left=mid-1>=0?mat[row][mid-1]:-1;
            if(mat[row][mid]>left&&mat[row][mid]>right)
            {
                int[] arr={row,mid};
                return arr;
            }
            else if(mat[row][mid]<left) high=mid-1;
            else low=mid+1;

        }
        int [] arr={-1,-1};
        return arr;
    }
    //Q2:https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
    int upperbound(int []arr,int x)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    int totalLess(int mat[][],int x)
    {
        int n=mat.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            cnt+=upperbound(mat[i],x);
        }
        return cnt;
    }
    int median(int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int req=n*m/2;
        for(int i=0;i<n;i++)
        {
            low=Math.min(mat[i][0],low);
            high=Math.max(mat[i][m-1],high);
        }
        while (low<=high)
        {
            int mid=(low+high)/2;
            int lessAndEq=totalLess(mat,mid);
            if(lessAndEq<=req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}

