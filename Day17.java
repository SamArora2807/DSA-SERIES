import java.util.Arrays;

public class Day17 {
    //Q1:https://leetcode.com/problems/isomorphic-strings/description/
    public boolean isIsomorphic(String s, String t) {
        int arr1[]=new int[128];
        int arr2[]=new int[128];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        for(int i=0;i<s.length();i++)
        {
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(arr1[ss]==-1&&arr2[tt]==-1)
            {
                arr1[ss]=tt;
                arr2[tt]=ss;
            }
            else if(arr1[ss]!=tt||arr2[tt]!=ss) return false;
        }
        return true;
}
//Q2:
public String removeOuterParentheses(String s) {
    int cnt=0;
    int i=0;
    StringBuilder sb=new StringBuilder();
    while(i<s.length())
    {
        if(s.charAt(i)=='(') 
        {
            cnt++;
            if(cnt>1) sb.append('(');
            i++;
        }
        else 
        {
            cnt--;
            if(cnt>0) sb.append(')');
            i++;
            
        }
    }
    return sb.toString();
}
}
