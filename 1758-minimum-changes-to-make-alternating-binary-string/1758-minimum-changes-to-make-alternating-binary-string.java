class Solution {
    public int minOperations(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=((i%2==0)?'0':'1')) a++;
            else b++;
        }
        return Math.min(a,b);
    }
}