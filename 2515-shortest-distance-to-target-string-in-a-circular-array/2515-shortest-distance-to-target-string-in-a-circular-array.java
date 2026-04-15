class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length,m=Integer.MAX_VALUE;
        boolean f=false;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)) {
                int d=Math.abs(startIndex-i);
                m=Math.min(m,Math.min(d,n-d));
                f=true;
            }
        }
        if(f) return m;
        return -1;
    }
}