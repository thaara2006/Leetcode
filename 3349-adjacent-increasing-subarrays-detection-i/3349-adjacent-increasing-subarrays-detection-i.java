class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i=0;
        while(i<=nums.size()-2*k){
            boolean s1=true,s2=true;
            for(int j=i;j<i+k-1;j++){
                if(nums.get(j)>=nums.get(j+1)) {
                    s1=false;
                    break;
                }
            }
            if(s1){
                for(int j=i+k;j<i+(2*k)-1;j++){
                    if(nums.get(j)>=nums.get(j+1)) {
                        s2=false;
                        break;
                    }
                }
            }
        if(s1 && s2) return true;
        i++;
        }
        return false;
    }
}