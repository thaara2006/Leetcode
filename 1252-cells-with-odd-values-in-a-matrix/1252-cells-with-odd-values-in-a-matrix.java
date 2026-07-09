class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][]=new int[m][n];
        for(int[] k:indices){
        for(int i=0;i<n;i++){
            a[k[0]][i]++;
        }
        for(int i=0;i<m;i++){
            a[i][k[1]]++;
        }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0) c++;
            }
        }
        return c;
    }
}