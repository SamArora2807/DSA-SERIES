import java.util.Arrays;
import java.util.Comparator;

public class day03 {
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
}
