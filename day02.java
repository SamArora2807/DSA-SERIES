
public class day02 {
    static int isGoodorBad(String S) {
        int n=S.length();
        int vowels=0;
        int con=0;
        int i=0;
        String v="aeiou";
        while(i<n){
            while(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u'||S.charAt(i)=='?')
            {
                con=0;
                vowels++;
                i++;
                if(vowels>5) return 0;
                if(i==n) break;
            }

            if(i==n) break;
            if(i>0&&S.charAt(i-1)=='?') i--;
            while(!(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')||S.charAt(i)=='?')
            {
                vowels =0 ;
                con++;
                i++;
                if(con>3) return 0;
                if(i==n) break;


            }
        }

        return 1;

    }
}
