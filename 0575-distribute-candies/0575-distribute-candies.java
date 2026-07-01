class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int c=candyType.length/2;
        if(c<set.size()) return c;
        return set.size();
    }
}