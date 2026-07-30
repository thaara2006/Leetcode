class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder(num);
        while(sb.length()>0){
            if(Integer.parseInt(String.valueOf(sb.charAt(sb.length()-1)))%2!=0) return sb.toString();
            else sb.deleteCharAt(sb.length()-1);
        }
        return "";
    }
}