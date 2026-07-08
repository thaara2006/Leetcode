class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int mo=Integer.MIN_VALUE, mi=Integer.MAX_VALUE,c=0;
        for(int i=0;i<mat.length;i++){
            c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c==mo){
                mi=Math.min(mi,i);
            }
            else{
                if(mo<c){
                    mo=c;
                    mi=i;
                }
            }
            //System.out.println(c+" "+mi+" "+mo);
        }
        return new int[]{mi,mo};
    }
}