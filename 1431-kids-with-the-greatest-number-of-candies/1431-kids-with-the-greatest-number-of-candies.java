class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=candies[0];
        for(int i=0;i<candies.length;i++){
            m=Math.max(m,candies[i]);
        }
        List<Boolean> r=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=m) r.add(true);
            else r.add(false);
        }
        return r;
    }
}