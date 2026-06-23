class Solution {
    public int largestAltitude(int[] gain) {
        int a=0,r=0;
        for(int i=0;i<gain.length;i++){
            a+=gain[i];
            r=Math.max(r,a);
        }
        return r;
    }
}