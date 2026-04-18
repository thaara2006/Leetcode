class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0],max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else if(nums[i]-min>max){
                max=nums[i]-min;
            }
        }
        return max==0?-1:max;
    }
}