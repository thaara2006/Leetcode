class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            s.add(jewels.charAt(i));
        }
        int c=0;
        for(int i=0;i<stones.length();i++){
            if(s.contains(stones.charAt(i))){
                c++;
            }
        }
        return c;
    }
}