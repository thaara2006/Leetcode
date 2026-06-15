class Solution {
    public boolean digitCount(String num) {
        int a[]=new int[num.length()];
        for(int i=0;i<num.length();i++){
            a[i]=num.charAt(i)-'0';
        }
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i) c++;
            }
            if(c!=a[i]) return false;
        }
        return true;
    }
}