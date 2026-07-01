class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int a=0,i=n,c=10;
        while(i>=c){
            i-=c;
            c--;
            a++;
        }
        return a%2!=0;
    }
}