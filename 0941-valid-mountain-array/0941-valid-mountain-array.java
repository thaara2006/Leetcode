class Solution {
    public boolean validMountainArray(int[] arr) {
        int m=Integer.MIN_VALUE,ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
                if(arr[ind]!=arr[i]){
                    ind=i;
                }
            }
        }
        boolean l=false,r=false;
        for(int i=ind;i>0;i--){
            if(arr[i]<=arr[i-1]){
                l=false;
                break;
            }
            else l=true;
        }
        for(int i=ind;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                l=false;
                break;
            }
            else r=true;
        }
        return l&&r?true:false;
    }
}