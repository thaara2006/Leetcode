class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int i=1;
        while(i<=nums[nums.length-1]){
            if(!l.contains(i*k)) return i*k;
            i++;
        }
        return i*k;
    }
}