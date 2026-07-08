class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int r[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            int c=0;
            for(int j=0;j<grid.length;j++){
                //String n=String.valueOf(grid[i][j]);
                c=Math.max(c,String.valueOf(grid[j][i]).length());
            }
            r[i]=c;
        }
        return r;
    }
}