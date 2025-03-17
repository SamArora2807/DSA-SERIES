public class Day15 {
    //Q1:https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=k-th-element-of-two-sorted-array
    public int kthElement(int a[], int b[], int k) {
        int m=a.length;
        int n=b.length;
        if(m>n) return kthElement(b,a,k);
        int low = Math.max(0, k - n), high = Math.min(k, m);
        int left=k;
        while (low<=high)
        {
            int mid1 = (low + high) / 2;
            int mid2=left-mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < m) r1 = a[mid1];
            if (mid2 < n) r2 = b[mid2];
            if (mid1 - 1 >= 0) l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0) l2 = b[mid2 - 1];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1,l2);
            }
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
    //Q2:https://leetcode.com/problems/search-a-2d-matrix/
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    
    //Q3:https://leetcode.com/problems/search-a-2d-matrix-ii/description/
    public boolean searchMatrix2(int[][] matrix, int target) {
        int m= matrix.length;
        int n=matrix[0].length;
        int row=0;
        int col=n-1;
        while(row<m&&col>=0)
        {
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) col--;
            else row++;
        }
        return false;
    }


}
