class Solution {
    public boolean checkDistances(String s, int[] distance) {
        boolean f=false;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i-1==distance[s.charAt(i)-'a']){
                        f=true;
                    }
                    else return false;
                }
            }
        }
        return true;
    }
}