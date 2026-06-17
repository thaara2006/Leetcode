class Solution {
    public int passThePillow(int n, int time) {
        int ocy=n-1;
        int cyC=time/ocy;
        if(cyC%2==0){
            return time-(ocy*cyC)+1;
        }
        return n-(time%ocy);
    }
}