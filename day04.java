import java.util.ArrayList;
import java.util.Collections;

public class day04 {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        int i=0;
        int j=m-1;
        while(j<arr.size())
        {
            mindiff=Math.min(arr.get(j)-arr.get(i),mindiff);
            j++;
            i++;
        }
        return mindiff;
    }
}
