class Solution {
    public int maxVowels(String s, int k) {
        //char c[]=s.toCharArray();
        int c=0;
        for(int i=0;i<k;i++){
            if(isV(s.charAt(i))){
                c++;
            }
        }
        int r=c;
        for(int i=k;i<s.length();i++){
            if(isV(s.charAt(i-k))) c--;
            if(isV(s.charAt(i))) c++;
            r=Math.max(r,c);
        }
        return r;
    }
    public boolean isV(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}