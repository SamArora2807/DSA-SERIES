public class Day18 {
    //Q1:https://leetcode.com/problems/valid-anagram/description/
    public boolean isAnagram(String s, String t) {
        int[] hash=new int[128];
        int[] hash2=new int[128];
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        for(char ch:s1)
        {
            hash[ch]++;
        }
        for(char ch:t1)
        {
            hash2[ch]++;
        }
        for(int i=97;i<128;i++)
        {
            if(hash[i]!=hash2[i]) return false;
        }
        return true;
    }
    //Q2:https://leetcode.com/problems/longest-common-prefix/description/
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(String i:strs)
        {
            if(i.length()< s.length()) s=s.substring(0,i.length());
            else i=i.substring(0,s.length());
            for(int x= i.length()-1;x>=0;x--)
            {
                if(i.charAt(x)!=s.charAt(x)) s=s.substring(0,x);
            }
        }
        return s;
    }
}
