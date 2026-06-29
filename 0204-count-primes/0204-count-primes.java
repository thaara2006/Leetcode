class Solution {
    public int countPrimes(int n) {
        boolean a[]=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++){
            if(!a[i]) c++;
            if((long)i*i<n){
                for(int j=i*i;j<n;j+=i){
                    a[j]=true;
                }
            }
        }
        return c;
    }
    // public boolean isPrime(int n){
    //     if(n<=1) return false;
    //     if(n<=3) return true;
    //     if(n%2==0 || n%3==0) return false;
    //     for(int i=5;i*i<=n;i++){
    //         if(n%i==0 || n%(i+1)==0) return false;
    //     }
    //     return true;
    // }
}