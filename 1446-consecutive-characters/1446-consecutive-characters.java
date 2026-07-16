class Solution {
    public int maxPower(String s) {
        if(s.length()<2) return s.length();
        int c=1, r=c;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)) {
                c++;
                r=Math.max(r,c);
            }
            else{
                c=1;
            }
        }
        return r;
    }
}