class Solution {
    public int pivotInteger(int n) {
        int k=n*(n+1)/2;
        int t=(int)Math.sqrt(k);
        if(t*t==k) return t; 
        return -1;
    }
}