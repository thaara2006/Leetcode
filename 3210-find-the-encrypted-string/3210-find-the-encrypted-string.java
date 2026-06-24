class Solution {
    public String getEncryptedString(String s, int k) {
        String r="";
        for(int i=0;i<s.length();i++){
            r+=s.charAt((i+k)%s.length());
        }
        return r;
    }
}