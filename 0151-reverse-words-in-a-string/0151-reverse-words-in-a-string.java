class Solution {
    public String reverseWords(String s) {
        String r="";
        String ss=s.trim();
        int i=ss.length()-1;
        while(i>=0){
            StringBuilder sb=new StringBuilder();
            int j=i;
            while(j>=0 && ss.charAt(j)!=' '){
                sb.append(ss.charAt(j));
                j--;
            }
            r+=sb.reverse().toString()+" ";
            i=j-1;
            while(i>=0 && ss.charAt(i)==' '){
                i--;
            }
        }
        return r.trim();
    }
}