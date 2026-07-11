class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        // if(purchaseAmount<=10){
        //     return 100-(purchaseAmount+10-purchaseAmount);
        // }
        int n=purchaseAmount%10;
        if(n>=5){
            purchaseAmount+=10-n;
        }
        else{
            purchaseAmount-=n;
        }
        return Math.abs(purchaseAmount-100);
    }
}