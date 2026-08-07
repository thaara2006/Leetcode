class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int f[]=new int[matrix.length+1];
            for(int j=0;j<matrix.length;j++){
                f[matrix[i][j]]++;
            }
            for(int j=1;j<f.length;j++){
                if(f[j]!=1) return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int f[]=new int[matrix.length+1];
            for(int j=0;j<matrix.length;j++){
                f[matrix[j][i]]++;
            }
            for(int j=1;j<f.length;j++){
                if(f[j]!=1) return false;
            }
        }
        return true;
    }
}