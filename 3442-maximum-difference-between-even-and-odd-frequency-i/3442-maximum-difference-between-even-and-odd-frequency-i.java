class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))%2!=0) max=Math.max(max,m.get(s.charAt(i)));
            else if(m.get(s.charAt(i))%2==0) min=Math.min(min,m.get(s.charAt(i)));
        }
        if(max==Integer.MIN_VALUE && min==Integer.MAX_VALUE) return -1;
        return max-min;
    }
}