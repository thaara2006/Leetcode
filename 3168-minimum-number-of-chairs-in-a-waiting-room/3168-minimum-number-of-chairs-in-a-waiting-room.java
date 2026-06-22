class Solution {
    public int minimumChairs(String s) {
        int c=0,p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E') {
                if(c<p) c++; // initially 0<0(c<p), so one chair is always less, then chair increments only when chair less than person
                p++; // person increments whenever person enters
            }
            else{
                p--; // person decrements whenever person leaves
            }
        }
        return c+1; // due to initial condition, one chair adds to the resulting chair(c)
    }
}