class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        while(i<numbers.length-1){
            int j=i+1;
            while(j<numbers.length){
                int sum=numbers[i]+numbers[j];
                if(i<j && sum==target){
                    return new int[]{i+1,j+1};
                }
                j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}