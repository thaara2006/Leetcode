class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSD(i)){
                l.add(i);
            }
        }
        return l;
    }
    public boolean isSD(int a){
        int n=a;
        while(a>0){
            int r=a%10;
            if(r==0) return false;
            else if(n%r==0) a/=10;
            else return false;
        }
        return true;
    }
}