class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> o=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            if(i==0) {
                o.add(l);
                continue;
            }
            else {
            List<Integer> n=o.get(i-1);
            for(int j=1;j<n.size();j++){
                l.add(n.get(j)+n.get(j-1));
            }
            l.add(1);
            o.add(l);
            }
        }
        return o.get(rowIndex);
    }
}