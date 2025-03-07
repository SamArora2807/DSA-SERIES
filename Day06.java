import java.util.ArrayList;
import java.util.List;

public class Day06 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> arr=new ArrayList<>();
        int[] a=new int[n+1];
        for(int i=1;i<rounds.length;i++)
        {
            if(rounds[i]>rounds[i-1])
            {
                if(i==1) a[rounds[i-1]]++;
                for(int j=rounds[i-1]+1;j<=rounds[i];j++)
                {
                    a[j]++;
                }
            }
            else {
                if(rounds[i-1]!=n)
                {
                    if(i==1) a[rounds[i-1]]++;
                    for(int j=rounds[i-1]+1;j<=n;j++)
                    {

                        a[j]++;
                    }
                    for(int j=1;j<=rounds[i];j++)
                    {
                        a[j]++;
                    }


                }
                else{
                    if(i==1) a[rounds[i-1]]++;
                    for(int j=1;j<=rounds[i];j++)
                    {
                        a[j]++;
                    }
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++)
        {
            if(a[i]>max)
            {
                arr.clear();
                arr.add(i);
                max=a[i];
            }
            else if(a[i]==max)
            {
                arr.add(i);
            }
        }
        return arr;
    }

}
