class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length, c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c+=nums[i-1]*nums[i-1];
            }
        }
        return c;
    }
}