class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty()) return 0;
        int i=0, c=0;
        while(i<s.length()-1){
            if(s.charAt(i)==' '){
                c++;
            }
            if(s.charAt(i+1)==' '){
                while(s.charAt(i)==' ') i++;
            }
            i++;
        }
        return c+1;
    }
}