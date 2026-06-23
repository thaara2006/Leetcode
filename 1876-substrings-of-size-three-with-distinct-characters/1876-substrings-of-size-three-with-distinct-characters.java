class Solution {
    public int countGoodSubstrings(String s) {
        int k=3,c=0;
        for(int i=0;i<=s.length()-k;i++){
            String b="";
            for(int j=i;j<i+k;j++){
                b+=s.charAt(j);
            }
            if(b.charAt(0)!=b.charAt(1) && b.charAt(1)!=b.charAt(2) && b.charAt(0)!=b.charAt(2)) c++;
        }
        return c;
    }
}