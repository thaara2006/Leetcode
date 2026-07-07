class Solution {
    public int captureForts(int[] forts) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<forts.length-1;i++){
            int j=i+1,c=0;
            if(forts[i]==1){
                while(j<forts.length && forts[j]!=1 && forts[j]!=-1){
                    c++;
                    j++;
                }
                if(j<forts.length && forts[i]!=forts[j]) m=Math.max(m,c);
            }
            else if(forts[i]==-1){
                while(j<forts.length && forts[j]!=1 && forts[j]!=-1){
                    c++;
                    j++;
                }
                if(j<forts.length && forts[i]!=forts[j]) m=Math.max(m,c);
            }
        }
        return m==Integer.MIN_VALUE?0:m;
    }
}