public class Day12 {
    //Q1https://leetcode.com/problems/binary-search/description/
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    //Q2:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public int[] searchRange(int[] arr, int target) {
        int[] x = {start(arr, target), end(arr, target)};
        return x;

    }

    int start(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid;
        int start = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                start = mid;
                high = mid - 1;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }


        }

        return start;
    }

    int end(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid;
        int end = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                end = mid;
                low = mid + 1;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }


        }

        return end;
    }
    //Q3:https://leetcode.com/problems/search-insert-position/description/
    public int searchInsert(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid;
        while(low<=high)
        {
            if(arr[low]>k) return low;
            if(arr[high]<k) return high+1;
            mid=(low+high)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) high=mid-1;
            else{
                low=mid+1;

            }
        }
        return 0;
    }
}

