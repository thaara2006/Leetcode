class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) { 
          return s.length();
        }
        int i=0, max=-1;
        while(i<s.length()){
            String sb=String.valueOf(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(sb.indexOf(s.charAt(j))==-1){
                    sb+=String.valueOf(s.charAt(j));
                }
                else{
                    break;
                }
            }
                    max=Math.max(max,sb.length());
            i++;
        }
        return max;
    }
}