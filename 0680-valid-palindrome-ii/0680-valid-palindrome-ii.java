class Solution {
    public boolean validPalindrome(String s) {
        char c[]=s.toCharArray();
        int i=0, j=c.length-1;
        boolean f=true;
        while(i<j){
            if(c[i]==c[j]){
                i++;
                j--;
            }
            else{
                f=((isP(c,i+1,j)) || (isP(c,i,j-1)));
                break;
            }
        }
        return f;
    }
    public boolean isP(char c[], int i, int j){
        while(i<j){
            if(c[i]!=c[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}