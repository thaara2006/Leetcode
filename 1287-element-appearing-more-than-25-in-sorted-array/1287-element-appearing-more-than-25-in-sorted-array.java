class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int p=arr.length/4;
        int f[]=new int[arr[n-1]+1];
        for(int i=0;i<n;i++){
            f[arr[i]]++;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]>p) return i;
        }
        return 0;
    }
}