class Solution {
    public int smallestNumber(int n) {
        for(int i=n;i<=2000;i++){
            String b=Integer.toBinaryString(i);
            boolean fb=true;
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='0') {
                    fb=false;
                    break;
                }
            }
            if(fb) return i;
        }
        return 0;
    }
}