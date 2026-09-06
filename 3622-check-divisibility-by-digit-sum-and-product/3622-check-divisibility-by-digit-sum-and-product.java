class Solution {
    public boolean checkDivisibility(int n) {
        int s=0, p=1, d=n;
        while(n>0){
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        return d%(s+p)==0;
    }
}