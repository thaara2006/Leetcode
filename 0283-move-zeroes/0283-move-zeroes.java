class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=i+1;
        while(i<nums.length-1 && j<nums.length){
            if(nums[i]==0 && nums[j]==0) j++;
            else if(nums[i]==0 && nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j=i;
            }
            else{
                i++;
                j=i;
            }
        }
    }
}