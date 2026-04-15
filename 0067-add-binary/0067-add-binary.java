class Solution {
    public String addBinary(String a, String b) {
        String r="";
        int i=a.length()-1,j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0 || c==1){
            int sum=c;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            r+=sum%2;
            c=sum/2;
        }
        String s=new StringBuilder(r).reverse().toString();
        return s;
    }
}