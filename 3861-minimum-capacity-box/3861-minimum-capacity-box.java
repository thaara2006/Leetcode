class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int si=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                si=i;
                break;
            }
        }
        for(int i=si+1;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<capacity[si]){
                si=i;
            }
        }
        return si;
    }
}