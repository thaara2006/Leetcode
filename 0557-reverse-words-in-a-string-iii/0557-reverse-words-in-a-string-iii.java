class Solution {
    public String reverseWords(String s) {
        String r="";
        String ss=s.trim();
        int i=0;
        while(i<ss.length()){
            StringBuilder sb=new StringBuilder();
            int j=i;
            while(j<ss.length() && ss.charAt(j)!=' '){
                sb.append(ss.charAt(j));
                j++;
            }
            r+=sb.reverse().toString()+" ";
            i=j+1;
            while(i<ss.length() && ss.charAt(i)==' '){
                i++;
            }
        }
        return r.trim();
    }
}