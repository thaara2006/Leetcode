class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double m=s/k;
        for(int i=k;i<nums.length;i++){
            s+=nums[i];
            s-=nums[i-k];
            m=Math.max(m,s/k);
        }
        return m;
    }
}