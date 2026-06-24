class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int c=0,i=1;
        while(i<=s.length()){
            for(int j=0;j<=s.length()-i;j++){
                //System.out.println("inner loop");
                String b=s.substring(j,j+i);
               //System.out.println(b);
                int z=0,o=0;
                for(int p=0;p<b.length();p++){
                    if(b.charAt(p)=='0') z++;
                    else o++;
                }
                if(z<=k || o<=k) c++;
            }
            i++;
        }
        return c;
    }
}