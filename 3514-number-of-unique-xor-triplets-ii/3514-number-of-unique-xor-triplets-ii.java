class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int c=0;
        boolean f[]=new boolean[1501*2];
        boolean fr[]=new boolean[1501*2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int xor=nums[i]^nums[j];
                f[xor]=true;
            }
        }
        for(int i=0;i<f.length;i++){
            if(f[i]){
                for(int j:nums){
                    fr[i^j]=true;
                }
            }
        }
        for(boolean i:fr){
            if(i) c++;
        }
        return c;
    }
}