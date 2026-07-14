class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]<nums[nums.length-1]) return isInc(nums);
        return isDec(nums);
    }
    public boolean isInc(int []nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
    public boolean isDec(int []nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) return false;
        }
        return true;
    }
}