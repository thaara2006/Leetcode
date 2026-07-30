class Solution {
    public int minimumPushes(String word) {
        int l=word.length();
        if(l<=8) return l;
        int r=l%8;
        int q=l/8;
        int i=1;
        int a=0;
        while(i<=q){
            a+=i*8;
            i++;
        }
        return a+(r*i);
    }
}