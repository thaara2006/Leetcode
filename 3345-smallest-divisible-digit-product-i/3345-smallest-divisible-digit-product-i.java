class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<150;i++){
            if(isDiv(i,t)) return i;
        }
        return 0;
    }
    public boolean isDiv(int n, int t){
        int p=1;
        while(n!=0){
            p*=n%10;
            n/=10;
        }
        return p%t==0;
    }
}