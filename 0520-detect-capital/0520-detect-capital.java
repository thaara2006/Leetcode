class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) c++;
        }
        if(c==0 || c==word.length() || (Character.isUpperCase(word.charAt(0)) && c==word.length()-1)) return true;
        return false;
    }
}