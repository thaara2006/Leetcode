class Solution {
    public int minimumChairs(String s) {
        int c=0,p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E') {
                if(c<p){
                    c++;
                }
                    p++;
            }
            else{
                p--;
            }
        }
        return c+1;
    }
}