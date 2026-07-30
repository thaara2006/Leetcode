class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String s[]=text.split(" ");
        int c=s.length;
        for(int i=0;i<s.length;i++){
            for(char ch:brokenLetters.toCharArray()){
                if(s[i].contains(String.valueOf(ch))) {
                    c--;
                    break;
                }
            }
        }
        return c;
    }
}