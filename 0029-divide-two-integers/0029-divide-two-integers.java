class Solution {
    public int divide(int dividend, int divisor) {
        int r=0;
        if(dividend<0 && divisor<0){
            r=Math.abs(dividend/divisor);
        }
        else r= dividend/divisor;
        return r;
    }
}