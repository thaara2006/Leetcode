class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int r=0, l=0;
        for(int i=0;i<lights.length;i++){
            l=Math.max(l,lights[i]);
        }
        for(int i=0;i<arrivalTime.length;i++){
            r=Math.max(r,arrivalTime[i]%period<l?0:period-(arrivalTime[i]%period));
        }
        return r;
    }
}