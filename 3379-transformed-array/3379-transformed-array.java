class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[i]=frwd(nums,i,nums[i]);
            }
            else if(nums[i]<0){
                a[i]=bkwd(nums,i,Math.abs(nums[i]));
            }
        }
        return a;
    }
    public int frwd(int[] nums, int i, int n){
        // int r=0;
        // for(int j=0;j<n;j++){
            return nums[(i+n) % nums.length];
        // }
        // return r;
    }
    public int bkwd(int[] nums, int i, int n){
        int s=nums.length;
        // for(int j=0;j<n;j++){
            return nums[(i-n%s+s) % s];
        // }
        // return r;
    }
}