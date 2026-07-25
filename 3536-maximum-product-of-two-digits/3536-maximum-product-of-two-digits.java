class Solution {
    public int maxProduct(int n) {
        List<Integer> l=new ArrayList<>();
        while(n!=0){
            l.add(n%10);
            n/=10;
        }
        int m=Integer.MIN_VALUE;
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                m=Math.max(m,l.get(i)*l.get(j));
            }
        }
        return m;
    }
}