class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int p[]=new int[2];
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                p[k++]=nums[i];
                i++;
            }
        }
        return p;
    }
}