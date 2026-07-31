class Solution {
    public String thousandSeparator(int n) {
        String sn=String.valueOf(n);
        StringBuilder s=new StringBuilder();
        int c=0;
        for(int i=sn.length()-1;i>=0;i--){
            if(c==3){
                s.append('.');
                c=0;
            }
                s.append(sn.charAt(i));
                c++;
        }
        return s.reverse().toString();
    }
}