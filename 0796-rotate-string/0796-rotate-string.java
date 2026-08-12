class Solution {
    public boolean rotateString(String s, String goal) {
        String st=s+s;
        for(int i=0;i<=st.length()-s.length();i++){
            if(st.substring(i,i+s.length()).equals(goal)) return true;
        }
        return false;
    }
}