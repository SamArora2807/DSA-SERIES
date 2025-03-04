import java.util.Arrays;
import java.util.Comparator;

public class day03 {
    //question 2:https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/?envType=problem-list-v2&envId=2030iluv
    public int numEquivDominoPairs(int[][] dominoes) {
        for(int[] i:dominoes) Arrays.sort(i);
        Arrays.sort(dominoes,(a,b)->Arrays.compare(a,b));
        int cnt=0;
        for(int i=0;i<dominoes.length-1;i++)
        {
            int j=i+1;
            while(j<dominoes.length&&dominoes[i][0]==dominoes[j][0]&&dominoes[i][1]==dominoes[j][1])
            {
                cnt++;
                j++;
            }
        }
        return cnt;
    }
    //question 1:https://leetcode.com/problems/flipping-an-image/?envType=problem-list-v2&envId=array
    void flip(int[] arr)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int [] i:image)
        {
            flip(i);
            for(int x=0;x<i.length;x++)
            {
                i[x]=i[x]^1;
            }
        }
        return image;

    }
}
