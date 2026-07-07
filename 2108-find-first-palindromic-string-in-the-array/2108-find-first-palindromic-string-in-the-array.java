class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPal(words[i])) return words[i];
        }
        return "";
    }
    public boolean isPal(String s){
        String o=s;
        StringBuilder sb=new StringBuilder(s);
        return (sb.reverse().toString()).equals(o);
        //return r.equals(o);
    }
}