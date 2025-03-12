import java.util.ArrayList;
import java.util.List;

public class Day11 {
    //Q1 pascal triangle https://leetcode.com/problems/pascals-triangle/description/
    // Approach used: simple iteration ,used the elements of previous row to insert in the current row
    //TC and SC both O(N*N)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> l;
        for (int i = 0; i < numRows; i++) {
            l = new ArrayList<>(i + 1);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l.add(1);
                else
                    l.add(lst.get(i - 1).get(j - 1) + lst.get(i - 1).get(j));
            }
            lst.add(l);
        }
        return lst;
    }
    //Q2 rotate array https://leetcode.com/problems/rotate-image/description/
    //Approach used : transpose and reverse the rows
    //TC O(N*N) SC O(N)
    public void rotate(int[][] matrix) {
        int m= matrix.length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
            int x=0;
            int y=m-1;
            while(x<=y)
            {
                int temp=matrix[i][x];
                matrix[i][x]=matrix[i][y];
                matrix[i][y]=temp;
                x++;
                y--;
            }
        }
    }
    //Q3 spiral print https://leetcode.com/problems/spiral-matrix/description/
    //Approach used : take 4 pointes and increment or decrement them accordingly after adding the elements in the list
    //TC and SC both O(m*n)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int top=0;

        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(arr.size()<matrix.length*matrix[0].length)
        {
            for(int i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
            }
            if(arr.size()==matrix.length*matrix[0].length) break;
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr.add(matrix[i][right]);
            }
            if(arr.size()==matrix.length*matrix[0].length) break;
            right--;
            for(int i=right;i>=left;i--)
            {
                arr.add(matrix[bottom][i]);
            }
            bottom--;
            if(arr.size()==matrix.length*matrix[0].length) break;
            for(int i=bottom;i>=top;i--)
            {
                arr.add(matrix[i][left]);
            }
            left++;
            if(arr.size()==matrix.length*matrix[0].length) break;
        }
        return arr;
    }
}
