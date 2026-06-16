class Solution {
    public String processStr(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) r+=s.charAt(i);
            else if(s.charAt(i)=='*'){
                if(r.length()>0){   
                    StringBuilder sb=new StringBuilder(r);
                    sb.deleteCharAt(r.length()-1);
                    r=sb.toString();
                }
            }
            else if(s.charAt(i)=='#'){
                if(r.length()>0){
                    //while()
                    r=r+r;
                }
                continue;
            }
            else if(s.charAt(i)=='%'){
                StringBuilder sb=new StringBuilder(r);
                sb.reverse();
                r=sb.toString();
            }
        }
        return r;
    }
}