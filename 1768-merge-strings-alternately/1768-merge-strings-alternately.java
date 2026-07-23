class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()<=word2.length()){
        String s="";
            int i=0;
            while(i<word1.length()){
                s+=word1.charAt(i);
                s+=word2.charAt(i);
                i++;
            }
            for(int j=i;j<word2.length();j++){
                s+=word2.charAt(j);
            }
            return s;
        }
        String s="";
            int i=0;
            while(i<word2.length()){
                s+=word1.charAt(i);
                s+=word2.charAt(i);
                i++;
            }
            for(int j=i;j<word1.length();j++){
                s+=word1.charAt(j);
            }
        return s;
    }
}