class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        int idx = 0;

        while (l.size() > 1) {
            idx = (idx + k - 1) % l.size();
            l.remove(idx);
        }

        return l.get(0);
    }
}