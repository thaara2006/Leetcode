class Solution {
    public int maximumValue(String[] strs) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            //if(strs[i].chars().allMatch(Character::isLetter)) m=Math.max(m,strs.length());
            if(strs[i].chars().allMatch(Character::isDigit)){
                int a=Integer.parseInt(strs[i]);
                m=Math.max(m,a);
            }
            else{
                m=Math.max(m,strs[i].length());
            }
        }
        return m;
    }
}