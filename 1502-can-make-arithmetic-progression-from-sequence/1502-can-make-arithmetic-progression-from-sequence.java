class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])!=a) return false;
        }
        return true;
    }
}