class Solution {
    public int buyChoco(int[] prices, int money) {
        int m=-1;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]+prices[j]<=money){
                    m=Math.max(m, money-(prices[i]+prices[j]));
                }
            }
        }
        if(m<0) return money;
        return m;
    }
}