class Solution {
    public int[] sumZero(int n) {
        int k=1;
        int a[]=new int[n];
        int i=0,j=n-1;
        while(i<j){
            a[i]=-k;
            a[j]=k;
            k++;
            i++;
            j--;
        }
        return a;
    }
}