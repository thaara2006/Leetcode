class Solution {
    public String truncateSentence(String s, int k) {
        String st[]=s.split(" ");
        String r="";
        for(int i=0;i<k;i++){
            r+=st[i]+" ";
        }
        return r.trim();
    }
}