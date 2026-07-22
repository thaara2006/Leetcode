class Solution {
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int i=0, j=c.length-1;
        while(i<j){
            if(isV(c[i]) && isV(c[j])){
                char t=c[i];
                c[i]=c[j];
                c[j]=t;
                i++;
                j--;
            }
            else if(isV(c[i]) && !isV(c[j])){
                j--;
            }
            else if(!isV(c[i]) && isV(c[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return new String(c);
    }
    public boolean isV(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}