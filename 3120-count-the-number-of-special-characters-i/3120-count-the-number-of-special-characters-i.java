class Solution {
    public int numberOfSpecialChars(String word) {
        boolean count[]=new boolean[26];
        int c=0;
        for(char ch='a';ch<='z';ch++){
            boolean s=false, cap=false;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==ch){
                    s=true;
                }
                if(word.charAt(i)==(char)ch-32){
                    cap=true;
                }
            }
            if(s && cap && !count[ch-'a']){
                count[ch-'a']=true;
                c++;
            }
        }
        return c;
    }
}