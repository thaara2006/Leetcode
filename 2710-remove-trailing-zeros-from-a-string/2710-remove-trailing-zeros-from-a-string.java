class Solution {
    public String removeTrailingZeros(String num) {
        String s="";
        int c=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                c=i+1;
                break;
            }
            else if(num.charAt(i)=='0'){
                c=i;
            }
        }
        for(int i=0;i<c;i++){
            s+=num.charAt(i);
        }
        // while(c<s.length()){
        //     s.deleteCharAt(c);
        // }
        return s;
    }
}