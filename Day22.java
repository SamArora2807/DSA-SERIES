public class Day22 {
    //Q1:https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
    public int minAddToMakeValid(String s) {
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                cnt1++;
            }
            else
            {
                if(cnt1>0)
                    cnt1--;
                else
                    cnt2++;
            }
        }
        return cnt1+cnt2;
    }
    //Q2:https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
    public int beautySum(String s) {
        int ans=0;
        for(int i=0; i<s.length();i++){
            int[] frq=new int[26];
            for(int j=i; j<s.length();j++){
                frq[s.charAt(j)-'a']++;
                int maxfrq=0;
                int minfrq=Integer.MAX_VALUE;
                for(int k=0; k<26; k++){
                    if(frq[k]>0){
                        maxfrq=Math.max(maxfrq,frq[k]);
                        minfrq=Math.min(minfrq,frq[k]);}
                }
                ans+=(maxfrq-minfrq);
            }
        }
        return ans;
}
}
