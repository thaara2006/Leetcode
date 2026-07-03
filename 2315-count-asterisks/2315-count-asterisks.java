class Solution {
    public int countAsterisks(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|' && i<s.length()-2){
                i=s.indexOf('|',i+1);
            }
            else{
                if(s.charAt(i)=='*') c++;
            }
        }
        return c;
    }
    // public int loop(String s, int i){
    //     while(i<s.length() && s.charAt(i)!='|'){
    //         i++;
    //     }
    //     return i;
    // }
    // public int loo(String s, int i){
    //     while(i<s.length() && s.charAt(i)!='|'){
    //         i++;
    //     }
    //     return i;
    // }
}