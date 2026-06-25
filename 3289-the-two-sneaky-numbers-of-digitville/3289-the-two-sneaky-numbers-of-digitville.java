class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int p[]=new int[2];
        int k=0;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                p[k++]=nums[i];
            }
        }
        return p;
    }
}